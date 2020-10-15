package com.aws.ref.model;

import java.math.BigDecimal;

public class DiscountMasterModel {

	private Integer discountId;
	private String discountCode;//abc
	private String discountType;
	private BigDecimal discountRate;
	private String discountDocType;
	private String discountFormula;
	
	public Integer getDiscountId() {
		return discountId;
	}
	public String getDiscountCode() {
		return discountCode;
	}
	public String getDiscountType() {
		return discountType;
	}
	public BigDecimal getDiscountRate() {
		return discountRate;
	}
	public String getDiscountDocType() {
		return discountDocType;
	}
	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	public void setDiscountRate(BigDecimal discountRate) {
		this.discountRate = discountRate;
	}
	public void setDiscountDocType(String discountDocType) {
		this.discountDocType = discountDocType;
	}
	public String getDiscountFormula() {
		return discountFormula;
	}
	public void setDiscountFormula(String discountFormula) {
		this.discountFormula = discountFormula;
	}
	
	
	
	
}
