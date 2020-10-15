package com.aws.ref;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import com.aws.ref.model.CoupanVsDiscountModel;
import com.aws.ref.model.CustomerVsDiscountModel;
import com.aws.ref.model.DiscountMasterModel;
import com.aws.ref.model.EmpVsDiscountModel;
import com.aws.ref.model.ItemMasterModel;
import com.aws.ref.model.ItemVsDiscountModel;
import com.aws.ref.model.UserModel;

/**
 * Hello world!
 *
 */
public class App 
{
	public static HashMap<String, EmpVsDiscountModel> empCodeVDiscount=new HashMap<String, EmpVsDiscountModel>();
	public static HashMap<String, CustomerVsDiscountModel> customerCodeVDiscount=new HashMap<String, CustomerVsDiscountModel>();
	public static HashMap<String, ItemVsDiscountModel> itemCodeVDiscount=new HashMap<String, ItemVsDiscountModel>();
	public static HashMap<String, CoupanVsDiscountModel> coupanVDiscount=new HashMap<String, CoupanVsDiscountModel>();
	public static Set<String> userType=new HashSet<>();
	BigDecimal PERCENTAGE_100=BigDecimal.TEN.multiply(BigDecimal.TEN);
			
	private static  void createStaticDatabaseValues() {
		System.out.println("asda");
		DBSetApp.createStaticDatabaseValues();
	}
	
	
    public static void main( String[] args )
    {
    	createStaticDatabaseValues();
        App app=new App();
        UserModel user=null;
        List<ItemMasterModel> itemList=new ArrayList<ItemMasterModel>();
        ItemMasterModel itemMasterModel=new ItemMasterModel("item001", "item001", new BigDecimal(2), BigDecimal.TEN);
        itemList.add(itemMasterModel);
        user=new UserModel(10,"emp001","EMP");
        user=new UserModel(10,"emp002","EMPAFF");
        //user=new UserModel(10,"cus001","CUS");
        String docYpe=null;
        String [] coupanArr=null;
        System.out.println(app.calculateNetPayableAmount(user, itemList, docYpe,coupanArr));
    }
    
    public String calculateNetPayableAmount(UserModel user,List<ItemMasterModel> itemList,String docYpe, String [] coupanArr) {
    	DiscountMasterModel discountMaster=null;
    	BigDecimal netPaybaleAmount=BigDecimal.ZERO;
    	for(ItemMasterModel itemMasterModel:itemList) {
    		discountMaster=getItemDiscount(user, itemMasterModel);
    		calculateItemModel(itemMasterModel,discountMaster);
    		netPaybaleAmount=itemMasterModel.getNetAmount().add(netPaybaleAmount);
    	}
    	discountMaster=getDUserDiscount(user);//getUserDiscount(user);
    	if(discountMaster!=null)
    	netPaybaleAmount=netPaybaleAmount.subtract(netPaybaleAmount.multiply(discountMaster.getDiscountRate()).divide(BigDecimal.TEN.multiply(BigDecimal.TEN)));
    	if(coupanArr!=null && coupanArr.length>0) {
    		System.out.println("Logic for coupan discount");
    	}
    	return "Net Payable Amount:"+netPaybaleAmount;
    }
    
    private void calculateItemModel(ItemMasterModel itemMasterModel,DiscountMasterModel discountMaster) {
    	BigDecimal discountPercentage=null;
    	BigDecimal discount=BigDecimal.ZERO;
    	if(discountMaster!=null) {
    		discountPercentage=discountMaster.getDiscountRate();
    	}
    	itemMasterModel.setItemAmount(itemMasterModel.getItemRate().multiply(itemMasterModel.getItemQty()));
    	if(discountPercentage!=null) {
    		discount=itemMasterModel.getItemAmount().multiply(discountPercentage).divide(PERCENTAGE_100);
    	}
    	itemMasterModel.setItemDiscount(discount);
		itemMasterModel.setNetAmount(itemMasterModel.getItemAmount().subtract(itemMasterModel.getItemDiscount()));    		
    	
    }
    private DiscountMasterModel getItemDiscount(UserModel user,ItemMasterModel itemMaster) {
    	ItemVsDiscountModel itemVsDiscountModel=itemCodeVDiscount.get(itemMaster.getItemGroupCode());
    	return itemVsDiscountModel.getDiscountMasterModel();
    }
    
    private DiscountMasterModel getDocDiscount(UserModel user,String docYpe) {
    	DiscountMasterModel discountMaster=null;
    	return discountMaster;
    }
    
    private DiscountMasterModel getUserDiscount(UserModel user) {
    	DiscountMasterModel discountMaster=null;
    	if(user!=null && user.getCustomerId()!=null) {
    		//old customer
    		CustomerVsDiscountModel customerVsDiscountModel=customerCodeVDiscount.get("cus001");
    		discountMaster=customerVsDiscountModel.getDiscountMasterModel();
    		if(user.getEmpCode()!=null && !user.getEmpCode().isEmpty()) {
    			// employee of store
    		}else {
    			
    		}
    	}else if(user!=null && user.getCustomerId()==null) {
    		// New Customer
    		if(user.getEmpCode()!=null && !user.getEmpCode().isEmpty()) {
    			// employee of store
    			EmpVsDiscountModel empVsDiscountModel=empCodeVDiscount.get("emp001");
    			discountMaster=empVsDiscountModel.getDiscountMasterModel();
    		}else {
    			
    		}
    	}else {
    		// No discount
    	}
    	
    	return discountMaster;
    }
    
    private void discountAlgo(UserModel user) {
    	if(user!=null && user.getCustomerId()!=null) {
    		//old customer
    		if(user.getEmpCode()!=null && !user.getEmpCode().isEmpty()) {
    			// employee of store
    		}else {
    			
    		}
    	}else if(user!=null && user.getCustomerId()==null) {
    		// New Customer
    		if(user.getEmpCode()!=null && !user.getEmpCode().isEmpty()) {
    			// employee of store
    		}else {
    			
    		}
    	}else {
    		// No discount
    	}
    	}
    
    private DiscountMasterModel getDUserDiscount(UserModel userModel) {
    	DiscountMasterModel discountMaster=null;
        switch (userModel.getUserType()) {
            case "EMPAFF":
            	discountMaster = empCodeVDiscount.get("emp002").getDiscountMasterModel();
                break;
            case "EMP":
                	discountMaster = empCodeVDiscount.get("emp001").getDiscountMasterModel();
                break;
            case "CUS":
            	discountMaster = customerCodeVDiscount.get("cus001").getDiscountMasterModel();
                break;
        }
        return discountMaster;
    }
}
