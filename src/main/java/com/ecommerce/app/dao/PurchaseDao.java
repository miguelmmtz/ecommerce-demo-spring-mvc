package com.ecommerce.app.dao;

import java.util.List;

import com.ecommerce.app.entity.Product;
import com.ecommerce.app.entity.Purchase;

public interface PurchaseDao {

	Integer addUserPurchase(Integer userId, List<Product> cart);

	Purchase getPurchase(Integer purchaseOrder);

	List<Purchase> getAllUserPurchases(Integer userId);

}
