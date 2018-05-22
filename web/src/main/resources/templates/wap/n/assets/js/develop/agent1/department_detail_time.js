import '@/assets/less/develop/sales.less';
import $ from 'jquery';
import _ from '@/assets/js/common/global.js';
import template from 'template';
import MyDate from '@/assets/js/common/date_new.js';
import ajaxCommon from './ajaxCommon.js';
import ChartRender from './ChartRender.js';
import devCommon from '@/assets/js/develop/common/common.js';

function Start(){   
   
    this.Init();
    this.Event();
    devCommon.dateDisabled();
}

Start.prototype = {
    Init : function(){
       var _this = this;
       let name = decodeURIComponent(_.GetUrlPara('name'));   
        _.GetTpl({
            url : '/agent1/department/time_detail_index.tpl',
            data :{
                pageTitle:name
            },
            success : function(html){
                $('#content').html(html);
                _this.RenderChart();
                _this.RenderTablePerson();
            }
        });
        
    },
    GetCommonPram: function(date){
        let _this = this;
        let route = _.GetPage().parentPage;
        let myDateFn =  MyDate.getCurPram(route);
        let pram = {
            route : route,
            pagaType : MyDate['index'][route],
            start :myDateFn.start,
            end :myDateFn.end,
            value:myDateFn.value,
        }
        return pram;
    },
    RenderChart :function(){
        var _this = this;
        let comPram = this.GetCommonPram();
        let chartPram = {
            queryType : comPram.pagaType,
            endDate : comPram.end,
            startDate : comPram.start
        }
        ajaxCommon.ChartAjax(chartPram).then(function(chartData){
             _.GetTpl({
                url : '/agent1/chart.tpl',
                data :{},
                success : function(html){
                    console.log(html)
                    $('#chart').html(html);
                    ChartRender.Render(chartData);
                }
            })
        });
    },
    
   
    RenderTablePerson : function(){
        let _this = this;
        
        let comPram = _this.GetCommonPram();
        let timeLevel = _.GetUrlPara('timeLevel');
        let tableType =  $('.tab-wrap .tab.active').attr('tableType');
        let pram = {
            tableType : 234,
            type : comPram.pagaType,
            endDate : comPram.end,
            startDate : comPram.start,
            timeLevel : timeLevel
        }

         ajaxCommon.tabbleOfAgent(pram).then(function(resData){
             _.GetTpl({
                url : '/agent1/department/time_table_person.tpl',
                data :resData,
                success : function(html){
                    $('#table-container').html(html);
                }
            })
        });
    },
   
    Event : function(){
        var _this = this;
      
        $(".date-wrap").off("change",'.tim input,.tim select');
        $(".date-wrap").on("change",'.tim input,.tim select',function(){
            _this.RenderChart();
            _this.RenderTablePerson();
              
        });
    } 

}
module.exports = Start;

    

