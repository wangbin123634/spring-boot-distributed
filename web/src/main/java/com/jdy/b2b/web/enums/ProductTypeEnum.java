package com.jdy.b2b.web.enums;

import java.util.Arrays;

/**
 * @Description 产品类型
 * @Author yyf
 * @DateTime 2017/9/1 14:21
 */
public enum ProductTypeEnum {
    TYPE_ZBDX(10, "周边短线"),
    TYPE_GNCX(11, "国内长线"),
    TYPE_CJLY(20, "出境长线"),
    TYPE_OFFSHORE_LONG(21, "出境短线"),
    TYPE_YL(30, "邮轮"),
    TYPE_TSY(40, "特色游"),
    TYPE_ZZY(50, "自由行"),
    OFFSHORE_LAND(51, "出境海岛"),
    DESIGN_TRAVEL(52, "定制旅游"),
    TEAM_MEET(54, "团队会奖"),
    SIGN_SERVER(55, "签证服务"),
    AIRPORT_BOOK(56, "机票预订"),
    HOTEL_BOOK(57, "酒店预订"),
    SINGLE_PART_AGENT(58, "单项委托"),
    OTHER_SERVICE(59, "其他服务"),
    OUTSIDE_ACTIVITY(60, "户外拓展"),
    STUDY_TRAVEL(61, "游学/研学"),
    SELF_TRAVEL(62, "自驾游"),
    GLOBAL_TRAVEL(63, "全球旅拍"),
    GLOBAL_FINANCE(64, "旅游金融"),
    TRAVEL_PROPERTY(65, "旅游地产"),
    PARENTAL(66, "亲子"),
	SINGLE_PHOTO(67,"单一资源+拍"),
	THEMETRAVEL(68,"主题游");
    private Integer value;
    private String desc;

    ProductTypeEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public Integer getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    public static String getDescByValue(Integer value) {
        return Arrays.stream(values()).filter(e -> e.equals(value)).map(e -> e.getDesc()).findFirst().orElse("");
    }

    public boolean equals(Integer value) {
        if (value == null) {
            return false;
        }
        if (this.value.equals(value)) {
            return true;
        } else {
            return false;
        }
    }
}