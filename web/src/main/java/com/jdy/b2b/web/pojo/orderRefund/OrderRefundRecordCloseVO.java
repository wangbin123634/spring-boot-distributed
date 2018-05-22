package com.jdy.b2b.web.pojo.orderRefund;


import com.jdy.b2b.web.util.BaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.reflect.Member;

/**
 * Created by yangcheng on 2018/2/28.
 */
@ApiModel
public class OrderRefundRecordCloseVO extends BaseVO {
    @ApiModelProperty(value = "订单id")
    private Long orderId;
    @ApiModelProperty(value = "退款状态 0关闭 1进行中 2成功确认")
    private Integer status;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
