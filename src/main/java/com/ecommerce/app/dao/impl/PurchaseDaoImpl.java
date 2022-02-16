package com.ecommerce.app.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecommerce.app.dao.PurchaseDao;
import com.ecommerce.app.entity.Product;
import com.ecommerce.app.entity.Purchase;

@Repository
public class PurchaseDaoImpl implements PurchaseDao{

	static HashMap<Integer, Purchase> purchases = new HashMap<>();
	static int purchaseOrder = 1;
	static double totalPrice = 0;
	
	@Override
	public Integer addUserPurchase(Integer userId, List<Product> cart) {
		Purchase purchase = new Purchase();
		purchase.setPurchaseOrderId(purchaseOrder);
		purchase.setUserId(userId);
		purchase.setPurchasedProducts(cart);
		
		cart.forEach(p -> {
			totalPrice += p.getProductPrice()*p.getProductQuantity();
		});
		purchase.setTotalPrice(totalPrice);
		purchase.setDateTime(java.time.LocalDateTime.now());
		
		purchases.put(purchaseOrder, purchase);
		System.out.println("Products purchased, order: "+purchase.getPurchaseOrderId());
		totalPrice = 0;
		return purchaseOrder++;
	}
	@Override
	public Purchase getPurchase(Integer purchaseOrder) {
		return purchases.get(purchaseOrder);
	}
	@Override
	public List<Purchase> getAllUserPurchases(Integer userId) {
		List<Purchase> allPurchasesByUser = new ArrayList<>();
		purchases.forEach((k,v) -> {
			if(v.getUserId().equals(userId)) allPurchasesByUser.add(v);
		});
		return allPurchasesByUser;
	}
	
}
