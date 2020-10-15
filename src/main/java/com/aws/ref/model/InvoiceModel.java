package com.aws.ref.model;

import java.math.BigDecimal;

public class InvoiceModel {
	    private  BigDecimal basicAmount;
	    private  BigDecimal discount;
	    private  BigDecimal invoiceAmount;
	    private  BigDecimal netInvoiceAmount;
	    private UserModel user;
		public BigDecimal getBasicAmount() {
			return basicAmount;
		}
		public BigDecimal getDiscount() {
			return discount;
		}
		public BigDecimal getInvoiceAmount() {
			return invoiceAmount;
		}
		public BigDecimal getNetInvoiceAmount() {
			return netInvoiceAmount;
		}
		public UserModel getUser() {
			return user;
		}
		public void setBasicAmount(BigDecimal basicAmount) {
			this.basicAmount = basicAmount;
		}
		public void setDiscount(BigDecimal discount) {
			this.discount = discount;
		}
		public void setInvoiceAmount(BigDecimal invoiceAmount) {
			this.invoiceAmount = invoiceAmount;
		}
		public void setNetInvoiceAmount(BigDecimal netInvoiceAmount) {
			this.netInvoiceAmount = netInvoiceAmount;
		}
		public void setUser(UserModel user) {
			this.user = user;
		}
	    
}

