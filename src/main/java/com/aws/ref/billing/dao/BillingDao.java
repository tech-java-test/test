package com.aws.ref.billing.dao;

import java.util.List;

import com.aws.ref.model.ItemMasterModel;
import com.aws.ref.model.UserModel;

public interface BillingDao {
	public String calculateNetPayableAmount(UserModel user,List<ItemMasterModel> itemList,String docYpe, String [] coupanArr);
}
