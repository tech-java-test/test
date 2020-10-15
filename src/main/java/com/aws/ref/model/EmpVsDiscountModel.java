package com.aws.ref.model;

public class EmpVsDiscountModel {

	private String empGroupCode;
	private DiscountMasterModel discountMasterModel;	
	public String getEmpGroupCode() {
		return empGroupCode;
	}
	public void setEmpGroupCode(String empGroupCode) {
		this.empGroupCode = empGroupCode;
	}
	public DiscountMasterModel getDiscountMasterModel() {
		return discountMasterModel;
	}
	public void setDiscountMasterModel(DiscountMasterModel discountMasterModel) {
		this.discountMasterModel = discountMasterModel;
	}
	
}
