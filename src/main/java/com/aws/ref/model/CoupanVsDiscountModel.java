package com.aws.ref.model;

public class CoupanVsDiscountModel {

	private String coupanCode;
	private DiscountMasterModel discountMasterModel;
	
	public String getCoupanCode() {
		return coupanCode;
	}
	public void setCoupanCode(String coupanCode) {
		this.coupanCode = coupanCode;
	}
	public DiscountMasterModel getDiscountMasterModel() {
		return discountMasterModel;
	}
	public void setDiscountMasterModel(DiscountMasterModel discountMasterModel) {
		this.discountMasterModel = discountMasterModel;
	}
	
}
