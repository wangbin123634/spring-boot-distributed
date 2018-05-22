package com.jdy.b2b.api.model.product;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

public class Trip extends BaseDO {
	private Long id;

	private Long tProductId;

	private String tTitle;

	private Integer tType;

	private String tFromTo;

	private String tMeals;

	private String tMealsRemark;

	private String tHotelRemark;

	private String tSimpleTrip;

	private Date createTime;

	private Long createUser;

	private Date updateTime;

	private Long updateUser;

	private String tDetailTrip;
	private Long phTripId;

	private Date tcEffectDay;

	private Integer tcEffectWeek;
	private String tcStartDay;
	private String tcEndDay;

	public String getTcStartDay() {
		return tcStartDay;
	}

	public void setTcStartDay(String tcStartDay) {
		this.tcStartDay = tcStartDay;
	}

	public String getTcEndDay() {
		return tcEndDay;
	}

	public void setTcEndDay(String tcEndDay) {
		this.tcEndDay = tcEndDay;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long gettProductId() {
		return tProductId;
	}

	public void settProductId(Long tProductId) {
		this.tProductId = tProductId;
	}

	public String gettTitle() {
		return tTitle;
	}

	public void settTitle(String tTitle) {
		this.tTitle = tTitle == null ? null : tTitle.trim();
	}

	public Integer gettType() {
		return tType;
	}

	public void settType(Integer tType) {
		this.tType = tType;
	}

	public String gettFromTo() {
		return tFromTo;
	}

	public void settFromTo(String tFromTo) {
		this.tFromTo = tFromTo == null ? null : tFromTo.trim();
	}

	public String gettMeals() {
		return tMeals;
	}

	public void settMeals(String tMeals) {
		this.tMeals = tMeals == null ? null : tMeals.trim();
	}

	public String gettMealsRemark() {
		return tMealsRemark;
	}

	public void settMealsRemark(String tMealsRemark) {
		this.tMealsRemark = tMealsRemark == null ? null : tMealsRemark.trim();
	}

	public String gettHotelRemark() {
		return tHotelRemark;
	}

	public void settHotelRemark(String tHotelRemark) {
		this.tHotelRemark = tHotelRemark == null ? null : tHotelRemark.trim();
	}

	public String gettSimpleTrip() {
		return tSimpleTrip;
	}

	public void settSimpleTrip(String tSimpleTrip) {
		this.tSimpleTrip = tSimpleTrip == null ? null : tSimpleTrip.trim();
	}

	@Override
	public Date getCreateTime() {
		return createTime;
	}

	@Override
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public Long getCreateUser() {
		return createUser;
	}

	@Override
	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	@Override
	public Date getUpdateTime() {
		return updateTime;
	}

	@Override
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public Long getUpdateUser() {
		return updateUser;
	}

	@Override
	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	public String gettDetailTrip() {
		return tDetailTrip;
	}

	public void settDetailTrip(String tDetailTrip) {
		this.tDetailTrip = tDetailTrip == null ? null : tDetailTrip.trim();
	}

	public void initCreateTime() {
		this.createTime = new Date();
	}

	public void initUpdateTime() {
		this.updateTime = new Date();
	}

	public void initCreatetimeAndUpdateTime() {
		this.createTime = new Date();
		this.updateTime = new Date();
	}

	public Long getPhTripId() {
		return phTripId;
	}

	public void setPhTripId(Long phTripId) {
		this.phTripId = phTripId;
	}

	public Date getTcEffectDay() {
		return tcEffectDay;
	}

	public void setTcEffectDay(Date tcEffectDay) {
		this.tcEffectDay = tcEffectDay;
	}

	public Integer getTcEffectWeek() {
		return tcEffectWeek;
	}

	public void setTcEffectWeek(Integer tcEffectWeek) {
		this.tcEffectWeek = tcEffectWeek;
	}

	@NotNull
	private List<Long> phHotelIds;
	@NotNull
	private List<Long> phScenicIds;

	public List<Long> getPhHotelIds() {
		return phHotelIds;
	}

	public void setPhHotelIds(List<Long> phHotelIds) {
		this.phHotelIds = phHotelIds;
	}

	public List<Long> getPhScenicIds() {
		return phScenicIds;
	}

	public void setPhScenicIds(List<Long> phScenicIds) {
		this.phScenicIds = phScenicIds;
	}

	private List<String> attachs;

	public List<String> getAttachs() {
		return attachs;
	}

	public void setAttachs(List<String> attachs) {
		this.attachs = attachs;
	}

}