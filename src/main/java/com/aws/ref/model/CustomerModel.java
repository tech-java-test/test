package com.aws.ref.model;

import java.util.Date;

public class CustomerModel {

	private Integer customerId;
	private String customerCode;
	private String customerGroupCode;
	private Date customerCreatedDate;
	
	public String getCustomerCode() {
		return customerCode;
	}
	public String getCustomerGroupCode() {
		return customerGroupCode;
	}
	public Date getCustomerCreatedDate() {
		return customerCreatedDate;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public void setCustomerGroupCode(String customerGroupCode) {
		this.customerGroupCode = customerGroupCode;
	}
	public void setCustomerCreatedDate(Date customerCreatedDate) {
		this.customerCreatedDate = customerCreatedDate;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
}
