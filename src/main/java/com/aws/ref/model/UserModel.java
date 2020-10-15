package com.aws.ref.model;
/**
 * 
 * @author chandan.sharma
 */

public class UserModel {

private String userType;
private String userCode;
private Integer customerId;
private String empCode;
private String [] coupanCodeArr;

public UserModel() {
	
}
public UserModel(Integer customerId,String empCode,String userType) {
	this.customerId=customerId;
	this.empCode=empCode;
	this.userType=userType;
}
public String getUserCode() {
	return userCode;
}
public Integer getCustomerId() {
	return customerId;
}
public void setUserCode(String userCode) {
	this.userCode = userCode;
}
public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}
public String getEmpCode() {
	return empCode;
}
public void setEmpCode(String empCode) {
	this.empCode = empCode;
}
public String[] getCoupanCodeArr() {
	return coupanCodeArr;
}
public void setCoupanCodeArr(String[] coupanCodeArr) {
	this.coupanCodeArr = coupanCodeArr;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}

}
