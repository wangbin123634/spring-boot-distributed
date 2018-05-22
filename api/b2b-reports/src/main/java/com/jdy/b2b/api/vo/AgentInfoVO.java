package com.jdy.b2b.api.vo;

import com.jdy.b2b.api.common.BaseVO;

/**
 * @Description 代理人佣金vo
 * @author 王斌
 * @date 2017年10月20日 上午11:34:03
 * @version V1.0
 */
public class AgentInfoVO extends BaseVO {
	private String minDate;
	private String maxDate;
	private String searchStr;
    private Long companyId;
    
	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getMinDate() {
		return minDate;
	}

	public void setMinDate(String minDate) {
		this.minDate = minDate;
	}

	public String getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(String maxDate) {
		this.maxDate = maxDate;
	}

	public String getSearchStr() {
		return searchStr;
	}

	public void setSearchStr(String searchStr) {
		this.searchStr = searchStr;
	}

}
