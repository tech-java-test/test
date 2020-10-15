package com.aws.ref;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.aws.ref.billing.dao.BillingDao;
import com.aws.ref.billing.dao.impl.BillingDaoImpl;
import com.aws.ref.model.ItemMasterModel;
import com.aws.ref.model.UserModel;


/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private BillingDao billingDao;
    //Item Discount is 10%
    @Before
    public void setUp() throws Exception {
        //Services
    	DBSetApp.createStaticDatabaseValues();
    	billingDao = new BillingDaoImpl();
    }

    private ItemMasterModel getItemMaster(BigDecimal qty,BigDecimal rate) {
    	return new ItemMasterModel("item001", "item001", qty, rate);
    }
    
    @Test
    public void UserIsEMP() {
    	//30%
    	 UserModel user=new UserModel(10,"emp001","EMP");
         List<ItemMasterModel> itemList=new ArrayList<ItemMasterModel>();
         itemList.add(getItemMaster(new BigDecimal(2),BigDecimal.TEN));
       assertEquals("Net Payable Amount:12.6",billingDao.calculateNetPayableAmount(user, itemList, null, null));
    }

    @Test
    public void UserIsAffiliate() {
    	//10%
    	 UserModel user=new UserModel(10,"emp002","EMPAFF");
         List<ItemMasterModel> itemList=new ArrayList<ItemMasterModel>();
         itemList.add(getItemMaster(new BigDecimal(3),BigDecimal.TEN));
       assertEquals("Net Payable Amount:24.3",billingDao.calculateNetPayableAmount(user, itemList, null, null));
    }
    @Test
    public void UserIs2YearsOld() {
    	//5%
    	 UserModel user=new UserModel(10,"cus001","CUS");
         List<ItemMasterModel> itemList=new ArrayList<ItemMasterModel>();
         itemList.add(getItemMaster(new BigDecimal(4),BigDecimal.TEN));
         assertEquals("Net Payable Amount:34.2",billingDao.calculateNetPayableAmount(user, itemList, null, null));
    }
}
