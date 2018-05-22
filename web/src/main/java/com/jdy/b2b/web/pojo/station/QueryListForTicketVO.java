package com.jdy.b2b.web.pojo.station;

import java.util.List;

import com.jdy.b2b.web.util.BaseVO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description 查询始发站列表ForTicketvo
 * @author 王斌
 * @date 2017年7月10日 上午9:53:24
 * @version V1.0
 */
@ApiModel
public class QueryListForTicketVO extends BaseVO {
	@ApiModelProperty("城市名称字符数组")
	private List<String> citys;
	@ApiModelProperty("站点名称")
	private String dName;
	@ApiModelProperty("公司编号")
	private Long companyId;
	@ApiModelProperty("站点有效状态")
	private Integer dStatus = 0;
	@ApiModelProperty("交通方式")
	private Integer dTraffic;

	public List<String> getCitys() {
		return citys;
	}

	public void setCitys(List<String> citys) {
		this.citys = citys;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Integer getdStatus() {
		return dStatus;
	}

	public void setdStatus(Integer dStatus) {
		this.dStatus = dStatus;
	}

	public Integer getdTraffic() {
		return dTraffic;
	}

	public void setdTraffic(Integer dTraffic) {
		this.dTraffic = dTraffic;
	}

}
