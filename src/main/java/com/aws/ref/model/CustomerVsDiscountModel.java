package com.aws.ref.model;

public class CustomerVsDiscountModel {

	private String customerGroupCode;
	private DiscountMasterModel discountMasterModel;	
	
	public String getCustomerGroupCode() {
		return customerGroupCode;
	}
	
	public void setCustomerGroupCode(String customerGroupCode) {
		this.customerGroupCode = customerGroupCode;
	}

	public DiscountMasterModel getDiscountMasterModel() {
		return discountMasterModel;
	}

	public void setDiscountMasterModel(DiscountMasterModel discountMasterModel) {
		this.discountMasterModel = discountMasterModel;
	}
	
}
