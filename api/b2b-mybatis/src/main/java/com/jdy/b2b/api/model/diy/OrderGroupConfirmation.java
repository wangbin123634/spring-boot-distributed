package com.jdy.b2b.api.model.diy;

import com.alibaba.fastjson.JSON;
import com.jdy.b2b.api.common.NumberToChineseUtil;
import com.jdy.b2b.api.model.Order;
import com.jdy.b2b.api.model.OrderPriceDetail;
import com.jdy.b2b.api.model.OrderTourist;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.apache.commons.lang3.StringUtils.isEmpty;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.apache.commons.lang3.time.DateFormatUtils.format;

/**
 * @Description
 * @Author yyf
 * @DateTime 2017/9/6 17:10
 */
public class OrderGroupConfirmation extends Order {
    //产品类型
    private Integer pType;
    private String pNo;
    private String pName;
    private String pSpecial;
    private String pNotes;

    //行程天数
    private Integer pDays;
    private String pCostInclude;
    private String pCostExclude;

    //出发日期
    private Date sCalendar;
    private Date sCalendarBack;

    private Date sLeaveTime;
    //入座方式 0:不对号入座 1:对号入座(系统随机) 2:对号入座(人工选择)
    private Integer sSitType;

    private String buyerCompanyTel;
    private String buyerCompanyPhone;
    private String buyerCompanyAddress;
    private String buyerCompanyFax;
    private String buyerPhone;
    private String salerCompanyTel;
    private String salerCompanyPhone;
    private String salerCompanyAddress;
    private String salerCompanyFax;
    private String salerPhone;

    //游客人数显示信息（如：1大2小）
    private String touristsNumInfo;
    //车辆数量显示信息（如：1车 2车）
    private String busNumInfo;
    //去程集合地人数显示信息（如：西湖 共:1人）如果存在多个则换行
    private String lvDepartureTouristsNumInfo;
    //回程集合地人数显示信息（如：西湖 共:1人）如果存在多个则换行
    private String rtDepartureTouristsNumInfo;
    //去程接送显示信息（如：九堡 共:1人）如果存在多个则换行
    private String lvStopsTouristsNumInfo;
    //回程接送显示信息（如：彭埠 共:1人）如果存在多个则换行
    private String rtStopsTouristsNumInfo;

    //合计
    private BigDecimal totalPrice;
    //合计：大写
    private String strTotalPrice;

    private List<OrderPriceDetailDTO> priceDetails;
    private List<OrderTouristDTO> tourists;
    private List<OrderTripDTO> trips;

    public Integer getpType() {
        return pType;
    }

    public void setpType(Integer pType) {
        this.pType = pType;
    }

    public String getpNo() {
        return pNo;
    }

    public void setpNo(String pNo) {
        this.pNo = pNo;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Integer getpDays() {
        return pDays;
    }

    public void setpDays(Integer pDays) {
        this.pDays = pDays;
    }

    public String getpCostInclude() {
        return pCostInclude;
    }

    public void setpCostInclude(String pCostInclude) {
        this.pCostInclude = pCostInclude;
    }

    public String getpCostExclude() {
        return pCostExclude;
    }

    public void setpCostExclude(String pCostExclude) {
        this.pCostExclude = pCostExclude;
    }

    public Date getsCalendar() {
        return sCalendar;
    }

    public void setsCalendar(Date sCalendar) {
        this.sCalendar = sCalendar;
    }

    public Date getsLeaveTime() {
        return sLeaveTime;
    }

    public void setsLeaveTime(Date sLeaveTime) {
        this.sLeaveTime = sLeaveTime;
    }

    public Integer getsSitType() {
        return sSitType;
    }

    public void setsSitType(Integer sSitType) {
        this.sSitType = sSitType;
    }

    public String getBuyerCompanyTel() {
        return buyerCompanyTel;
    }

    public void setBuyerCompanyTel(String buyerCompanyTel) {
        this.buyerCompanyTel = buyerCompanyTel;
    }

    public String getBuyerCompanyPhone() {
        return buyerCompanyPhone;
    }

    public void setBuyerCompanyPhone(String buyerCompanyPhone) {
        this.buyerCompanyPhone = buyerCompanyPhone;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getSalerCompanyAddress() {
        return salerCompanyAddress;
    }

    public void setSalerCompanyAddress(String salerCompanyAddress) {
        this.salerCompanyAddress = salerCompanyAddress;
    }

    public String getSalerPhone() {
        return salerPhone;
    }

    public void setSalerPhone(String salerPhone) {
        this.salerPhone = salerPhone;
    }

    public String getBuyerCompanyAddress() {
        return buyerCompanyAddress;
    }

    public void setBuyerCompanyAddress(String buyerCompanyAddress) {
        this.buyerCompanyAddress = buyerCompanyAddress;
    }

    public String getBuyerCompanyFax() {
        return buyerCompanyFax;
    }

    public void setBuyerCompanyFax(String buyerCompanyFax) {
        this.buyerCompanyFax = buyerCompanyFax;
    }

    public String getSalerCompanyTel() {
        return salerCompanyTel;
    }

    public void setSalerCompanyTel(String salerCompanyTel) {
        this.salerCompanyTel = salerCompanyTel;
    }

    public String getSalerCompanyPhone() {
        return salerCompanyPhone;
    }

    public void setSalerCompanyPhone(String salerCompanyPhone) {
        this.salerCompanyPhone = salerCompanyPhone;
    }

    public String getSalerCompanyFax() {
        return salerCompanyFax;
    }

    public void setSalerCompanyFax(String salerCompanyFax) {
        this.salerCompanyFax = salerCompanyFax;
    }

    public String getpSpecial() {
        return pSpecial;
    }

    public void setpSpecial(String pSpecial) {
        this.pSpecial = pSpecial;
    }

    public String getpNotes() {
        return pNotes;
    }

    public void setpNotes(String pNotes) {
        this.pNotes = pNotes;
    }

    public List<OrderPriceDetailDTO> getPriceDetails() {
        return priceDetails;
    }

    public void setPriceDetails(List<OrderPriceDetailDTO> priceDetails) {
        this.priceDetails = priceDetails;
    }

    public List<OrderTouristDTO> getTourists() {
        return tourists;
    }

    public void setTourists(List<OrderTouristDTO> tourists) {
        this.tourists = tourists;
    }

    public List<OrderTripDTO> getTrips() {
        return trips;
    }

    public void setTrips(List<OrderTripDTO> trips) {
        this.trips = trips;
    }

    public Date getsCalendarBack() {
        return DateUtils.addDays(this.sCalendar, pDays - 1);
    }

    public BigDecimal getTotalPrice() {
        return priceDetails.stream().map(d -> d.getOpTotalPrice()).reduce((t1, t2) -> t1.add(t2)).orElse(BigDecimal.ZERO);
    }

    public String getStrTotalPrice() {
        return NumberToChineseUtil.digitUppercase(getTotalPrice().doubleValue());
    }

    public String getTouristsNumInfo() {
        int big = 0;
        int small = 0;
        for (OrderTourist t : tourists) {
            if (0 == t.getOtType()) {
                big++;
            } else if (1 == t.getOtType()) {
                small++;
            }
        }
        return String.format("%d大,%d小", big, small);
    }

    public String getBusNumInfo() {
        if (isEmpty(getoBusSeat())) {
            return "";
        }
        List<Map> list = (List<Map>) JSON.parse(getoBusSeat());
        if (CollectionUtils.isEmpty(list)) {
            return "";
        }
        return list.stream().filter(map -> !CollectionUtils.isEmpty(map)).map(map -> map.get("busNo") + "车").collect(Collectors.joining(","));
    }

    public String getLvDepartureTouristsNumInfo() {
        Map<String, List<OrderTouristDTO>> map = tourists.stream().filter(t -> isNotBlank(t.getLvDepartureName())).collect(Collectors.groupingBy(OrderTouristDTO::getLvDepartureName));
        return map.entrySet().stream().map(e -> format(sLeaveTime, "HH:mm") + "/" + e.getKey() + ",共:" + e.getValue().size() + "人").collect(Collectors.joining("\n"));
    }

    public String getRtDepartureTouristsNumInfo() {
        Map<String, List<OrderTouristDTO>> map = tourists.stream().filter(t -> isNotBlank(t.getRtDepartureName())).collect(Collectors.groupingBy(OrderTouristDTO::getRtDepartureName));
        return map.entrySet().stream().map(e -> e.getKey() + ",共:" + e.getValue().size() + "人").collect(Collectors.joining("\n"));
    }

    public String getLvStopsTouristsNumInfo() {
        List<OrderTouristDTO> ts = JSON.parseArray(JSON.toJSONString(tourists), OrderTouristDTO.class);
        ts.stream().filter(t -> t.getOtLeaveType() != 0).forEach(t -> t.setLvDepartureName(t.getLvStopName()));

        Map<String, List<OrderTouristDTO>> map = ts.stream().filter(t -> isNotBlank(t.getLvDepartureName())).collect(Collectors.groupingBy(OrderTouristDTO::getLvDepartureName));
        return map.entrySet().stream().map(e -> e.getKey() + ",共:" + e.getValue().size() + "人").collect(Collectors.joining("\n"));
    }

    public String getRtStopsTouristsNumInfo() {
        List<OrderTouristDTO> ts = JSON.parseArray(JSON.toJSONString(tourists), OrderTouristDTO.class);
        ts.stream().filter(t -> t.getOtReturnType() != 0).forEach(t -> t.setRtDepartureName(t.getRtStopName()));

        Map<String, List<OrderTouristDTO>> map = ts.stream().filter(t -> isNotBlank(t.getRtDepartureName())).collect(Collectors.groupingBy(OrderTouristDTO::getRtDepartureName));
        return map.entrySet().stream().map(e -> e.getKey() + ",共:" + e.getValue().size() + "人").collect(Collectors.joining("\n"));
    }
}
