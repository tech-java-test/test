package com.aws.ref.model;

public class ItemVsDiscountModel {
	private String itemGroupCode;
	private DiscountMasterModel discountMasterModel;	
	public String getItemGroupCode() {
		return itemGroupCode;
	}
	public void setItemGroupCode(String itemGroupCode) {
		this.itemGroupCode = itemGroupCode;
	}
	public DiscountMasterModel getDiscountMasterModel() {
		return discountMasterModel;
	}
	public void setDiscountMasterModel(DiscountMasterModel discountMasterModel) {
		this.discountMasterModel = discountMasterModel;
	}
}
