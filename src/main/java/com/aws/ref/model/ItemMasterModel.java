package com.aws.ref.model;

import java.math.BigDecimal;

public class ItemMasterModel {

	private String itemGroupCode;
	private String itemCode;
	private String itemDesc;
	private Integer itemId;
	private BigDecimal itemQty;
	private BigDecimal itemRate;
	private BigDecimal itemAmount;
	private BigDecimal itemDiscount;
	private BigDecimal netAmount;
	
	
	public ItemMasterModel() {
		
	}
	public ItemMasterModel(String itemGroupCode,String itemCode,BigDecimal qty,BigDecimal rate) {
		this.itemCode=itemCode;
		this.itemGroupCode=itemGroupCode;
		this.itemQty=qty;
		this.itemRate=rate;
	}
	   
	
	public String getItemCode() {
		return itemCode;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public Integer getItemId() {
		return itemId;
	}
	public BigDecimal getItemQty() {
		return itemQty;
	}
	public BigDecimal getItemRate() {
		return itemRate;
	}
	public BigDecimal getItemAmount() {
		return itemAmount;
	}
	public BigDecimal getItemDiscount() {
		return itemDiscount;
	}
	public BigDecimal getNetAmount() {
		return netAmount;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public void setItemQty(BigDecimal itemQty) {
		this.itemQty = itemQty;
	}
	public void setItemRate(BigDecimal itemRate) {
		this.itemRate = itemRate;
	}
	public void setItemAmount(BigDecimal itemAmount) {
		this.itemAmount = itemAmount;
	}
	public void setItemDiscount(BigDecimal itemDiscount) {
		this.itemDiscount = itemDiscount;
	}
	public void setNetAmount(BigDecimal netAmount) {
		this.netAmount = netAmount;
	}
	public String getItemGroupCode() {
		return itemGroupCode;
	}
	public void setItemGroupCode(String itemGroupCode) {
		this.itemGroupCode = itemGroupCode;
	}
	
	
	
	
	
}
