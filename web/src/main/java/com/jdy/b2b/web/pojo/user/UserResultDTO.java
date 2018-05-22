package com.jdy.b2b.web.pojo.user;

import java.io.Serializable;
import java.util.Date;

import com.jdy.b2b.web.pojo.distributionSystemEntity.login.*;

/**
 * Created by yangcheng on 2017/7/17.
 */
public class UserResultDTO implements Serializable {
	private static final long serialVersionUID = -2359167109901932798L;
	/**
	 * 同步用户信息
	 */
	private static final String SALER_POSTION = "1";
	private String uUid;
	private String uPid;
	private Long uPositionId;
	private String uDepartmentName;
	private String gNo;
	private String uPositionName;
	private int uLevel;

	/*-------------sp db--------------------*/
	private Long userId;

	private String uAccount;

	private String uPassword;

	private String uRealName;

	private String uPym;

	private Long uCompanyId;

	private Long uDepartmentId;

	private Integer uDataLimit;

	private Long uRoleId;

	private Integer uType;

	private String uPost;

	private String uAddress;

	private String uTel;

	private String uIdcard;

	private Boolean uSex;

	private Date uBirthday;

	private Integer uDegree;

	private Integer uPolitical;

	private String uPhone;

	private String uFax;

	private String uQq;

	private String uEmail;

	private String uContacts;

	private String uContactsPhone;
	private String urRoleNo;
	private String uRemark;
	private String urRoleContent;
	private String urRoleContentArray;
	private Integer uStatus;
	private String urRoleName;
	private String cName;
	private Integer cType;
	private String dName;

	private String uPic;

	private Date uLastLogin;
	private Long oaid;// oa系统id

	public UserResultDTO(JwtUser jwtUser) {
		this.userId = jwtUser.getUid();
		this.uDepartmentId = jwtUser.getDeptId();
		this.dName = jwtUser.getDeptName();
		this.uWxOpenId = jwtUser.getOpenId();
		this.uCompanyId = jwtUser.getOrgId();
		this.cName = jwtUser.getOrgName();
		this.uTel = jwtUser.getPhone();
		this.uRealName = jwtUser.getUsername();
	}

	public Long getOaid() {
		return oaid;
	}

	public void setOaid(Long oaid) {
		this.oaid = oaid;
	}

	// 返回前端appid
	private String appId;

	private Long roleId;

	private Integer uStype;

	private String politicalName;
	private String degreeName;
	private String uNo;
	private String uWxname;
	private String uDtype;
	private Date updateTime;

	/*----------------distributionSystemDTO:分销登录后回传对象-----------------*/
	private OpenIdLoginResult distributionSystemDTO;

	public UserResultDTO() {
	}

	public UserResultDTO(OpenIdLoginResult distributionSystemDTO) {
		Employee employee = distributionSystemDTO.getEmployee();
		this.userId = employee.getEmployeeId();
		this.uAccount = employee.getLoginName();
		this.uRealName = employee.getEmployeeName();
		OrgChart orgChart = distributionSystemDTO.getDept().getOrgChart();
		this.uCompanyId = orgChart.getDeptId();
		this.setcName(orgChart.getDeptName());
		this.uDepartmentId = distributionSystemDTO.getDept().getDeptId();
		this.uDepartmentName = distributionSystemDTO.getDept().getDeptName();
		this.distributionSystemDTO = distributionSystemDTO;
		Position position = distributionSystemDTO.getPosition();
		// 1销售, 2非销售
		Integer positionType = position.getPositionType();
		// `u_type` int(1) NOT NULL COMMENT '用户区分0:非销售类员工1:销售类员工',
		if (SALER_POSTION.equals(positionType)) {
			this.setuType(1);
			this.setuStype(1);
		} else {
			this.setuType(0);
			this.setuStype(0);
		}
		this.uTel = employee.getMobile();
		this.uPositionId = position.getPositionId();
	}

	public OpenIdLoginResult getDistributionSystemDTO() {
		return distributionSystemDTO;
	}

	public void setDistributionSystemDTO(
			OpenIdLoginResult distributionSystemDTO) {
		this.distributionSystemDTO = distributionSystemDTO;
	}

	public int getuLevel() {
		return uLevel;
	}

	public void setuLevel(int uLevel) {
		this.uLevel = uLevel;
	}

	public String getuUid() {
		return uUid;
	}

	public void setuUid(String uUid) {
		this.uUid = uUid;
	}

	public String getuPid() {
		return uPid;
	}

	public void setuPid(String uPid) {
		this.uPid = uPid;
	}

	public Long getuPositionId() {
		return uPositionId;
	}

	public void setuPositionId(Long uPositionId) {
		this.uPositionId = uPositionId;
	}

	public String getuDepartmentName() {
		return uDepartmentName;
	}

	public void setuDepartmentName(String uDepartmentName) {
		this.uDepartmentName = uDepartmentName;
	}

	public String getgNo() {
		return gNo;
	}

	public void setgNo(String gNo) {
		this.gNo = gNo;
	}

	public String getuPositionName() {
		return uPositionName;
	}

	public void setuPositionName(String uPositionName) {
		this.uPositionName = uPositionName;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getPoliticalName() {
		return politicalName;
	}

	public void setPoliticalName(String politicalName) {
		this.politicalName = politicalName;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public String getuNo() {
		return uNo;
	}

	public void setuNo(String uNo) {
		this.uNo = uNo;
	}

	public String getuWxname() {
		return uWxname;
	}

	public void setuWxname(String uWxname) {
		this.uWxname = uWxname;
	}

	public String getuDtype() {
		return uDtype;
	}

	public void setuDtype(String uDtype) {
		this.uDtype = uDtype;
	}

	public Integer getuStype() {
		return uStype;
	}

	public void setuStype(Integer uStype) {
		this.uStype = uStype;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public Date getuLastLogin() {
		return uLastLogin;
	}

	public void setuLastLogin(Date uLastLogin) {
		this.uLastLogin = uLastLogin;
	}

	public String getuPic() {
		return uPic;
	}

	public void setuPic(String uPic) {
		this.uPic = uPic;
	}

	public String getUrRoleContentArray() {
		return urRoleContentArray;
	}

	public void setUrRoleContentArray(String urRoleContentArray) {
		this.urRoleContentArray = urRoleContentArray;
	}

	public String getUrRoleNo() {
		return urRoleNo;
	}

	public void setUrRoleNo(String urRoleNo) {
		this.urRoleNo = urRoleNo;
	}

	public String getUrRoleContent() {
		return urRoleContent;
	}

	public void setUrRoleContent(String urRoleContent) {
		this.urRoleContent = urRoleContent;
	}

	public Long getuCompanyId() {
		return uCompanyId;
	}

	public String getuPym() {
		return uPym;
	}

	public void setuPym(String uPym) {
		this.uPym = uPym;
	}

	public void setuCompanyId(Long uCompanyId) {
		this.uCompanyId = uCompanyId;
	}

	public Long getuDepartmentId() {
		return uDepartmentId;
	}

	public void setuDepartmentId(Long uDepartmentId) {
		this.uDepartmentId = uDepartmentId;
	}

	public Long getuRoleId() {
		return uRoleId;
	}

	public void setuRoleId(Long uRoleId) {
		this.uRoleId = uRoleId;
	}

	public String getuAddress() {
		return uAddress;
	}

	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}

	public String getuIdcard() {
		return uIdcard;
	}

	public void setuIdcard(String uIdcard) {
		this.uIdcard = uIdcard;
	}

	public Boolean getuSex() {
		return uSex;
	}

	public void setuSex(Boolean uSex) {
		this.uSex = uSex;
	}

	public Date getuBirthday() {
		return uBirthday;
	}

	public void setuBirthday(Date uBirthday) {
		this.uBirthday = uBirthday;
	}

	public Integer getuDegree() {
		return uDegree;
	}

	public void setuDegree(Integer uDegree) {
		this.uDegree = uDegree;
	}

	public Integer getuPolitical() {
		return uPolitical;
	}

	public void setuPolitical(Integer uPolitical) {
		this.uPolitical = uPolitical;
	}

	public String getuPhone() {
		return uPhone;
	}

	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}

	public String getuFax() {
		return uFax;
	}

	public void setuFax(String uFax) {
		this.uFax = uFax;
	}

	public String getuQq() {
		return uQq;
	}

	public void setuQq(String uQq) {
		this.uQq = uQq;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public String getuContacts() {
		return uContacts;
	}

	public void setuContacts(String uContacts) {
		this.uContacts = uContacts;
	}

	public String getuContactsPhone() {
		return uContactsPhone;
	}

	public void setuContactsPhone(String uContactsPhone) {
		this.uContactsPhone = uContactsPhone;
	}

	public String getuRemark() {
		return uRemark;
	}

	public void setuRemark(String uRemark) {
		this.uRemark = uRemark;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public Integer getcType() {
		return cType;
	}

	public void setcType(Integer cType) {
		this.cType = cType;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getuAccount() {
		return uAccount;
	}

	public void setuAccount(String uAccount) {
		this.uAccount = uAccount;
	}

	public String getuRealName() {
		return uRealName;
	}

	public void setuRealName(String uRealName) {
		this.uRealName = uRealName;
	}

	public Integer getuDataLimit() {
		return uDataLimit;
	}

	public void setuDataLimit(Integer uDataLimit) {
		this.uDataLimit = uDataLimit;
	}

	public Integer getuType() {
		return uType;
	}

	public void setuType(Integer uType) {
		this.uType = uType;
	}

	public String getuPost() {
		return uPost;
	}

	public void setuPost(String uPost) {
		this.uPost = uPost;
	}

	public String getuTel() {
		return uTel;
	}

	public void setuTel(String uTel) {
		this.uTel = uTel;
	}

	public Integer getuStatus() {
		return uStatus;
	}

	public void setuStatus(Integer uStatus) {
		this.uStatus = uStatus;
	}

	public String getUrRoleName() {
		return urRoleName;
	}

	public void setUrRoleName(String urRoleName) {
		this.urRoleName = urRoleName;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	private String uWxOpenId;// 微信openid

	public String getuWxOpenId() {
		return uWxOpenId;
	}

	public void setuWxOpenId(String uWxOpenId) {
		this.uWxOpenId = uWxOpenId;
	}

}