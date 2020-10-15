package com.aws.ref;

import java.math.BigDecimal;

import com.aws.ref.model.CoupanVsDiscountModel;
import com.aws.ref.model.CustomerVsDiscountModel;
import com.aws.ref.model.DiscountMasterModel;
import com.aws.ref.model.EmpVsDiscountModel;
import com.aws.ref.model.ItemVsDiscountModel;

public class DBSetApp {

	public static void createStaticDatabaseValues() {
		EmpVsDiscountModel empVsDiscountModel=new EmpVsDiscountModel();
		CustomerVsDiscountModel customerVsDiscountModel=new CustomerVsDiscountModel();
		ItemVsDiscountModel itemVsDiscountModel=new ItemVsDiscountModel();
		CoupanVsDiscountModel coupanVsDiscountModel=new CoupanVsDiscountModel();
		DiscountMasterModel discountMasterModelITEM=new DiscountMasterModel();
		discountMasterModelITEM.setDiscountCode("DIS008");
		discountMasterModelITEM.setDiscountRate(new BigDecimal(10));
		
		
		DiscountMasterModel discountMasterModel=new DiscountMasterModel();
		discountMasterModel.setDiscountCode("DIS001");
		discountMasterModel.setDiscountRate(new BigDecimal(30));
		
		empVsDiscountModel.setEmpGroupCode("emp001");
		empVsDiscountModel.setDiscountMasterModel(discountMasterModel);
		
		itemVsDiscountModel.setItemGroupCode("item001");
		itemVsDiscountModel.setDiscountMasterModel(discountMasterModelITEM);
		EmpVsDiscountModel empVsDiscountModel2=new EmpVsDiscountModel();
		empVsDiscountModel2.setEmpGroupCode("emp002");
		DiscountMasterModel discountMasterModel2=new DiscountMasterModel();
		discountMasterModel2.setDiscountCode("DIS002");
		discountMasterModel2.setDiscountRate(BigDecimal.TEN);
		empVsDiscountModel2.setDiscountMasterModel(discountMasterModel2);
		
		customerVsDiscountModel.setCustomerGroupCode("cus001");
		DiscountMasterModel discountMasterModelCust=new DiscountMasterModel();
		customerVsDiscountModel.setDiscountMasterModel(discountMasterModelCust);
		discountMasterModelCust.setDiscountRate(new BigDecimal(5));
		discountMasterModelCust.setDiscountCode("DIS003");
		
		App.userType.add("EMP");
		App.userType.add("CUS");
		App.userType.add("EMPAFF");
		App.empCodeVDiscount.put("emp001", empVsDiscountModel);
		App.empCodeVDiscount.put("emp002", empVsDiscountModel2);
		
		App.customerCodeVDiscount.put("cus001", customerVsDiscountModel);
		App.itemCodeVDiscount.put("item001", itemVsDiscountModel);
		App.coupanVDiscount.put("cop001", coupanVsDiscountModel);
		
	}
}
