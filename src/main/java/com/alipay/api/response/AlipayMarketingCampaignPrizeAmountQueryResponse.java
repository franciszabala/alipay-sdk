package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.prize.amount.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-23 14:22:01
 */
public class AlipayMarketingCampaignPrizeAmountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1375571334272388283L;

	/** 
	 * 奖品剩余数量，数值
	 */
	@ApiField("remain_amount")
	private String remainAmount;

	public void setRemainAmount(String remainAmount) {
		this.remainAmount = remainAmount;
	}
	public String getRemainAmount( ) {
		return this.remainAmount;
	}

}
