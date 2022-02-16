package com.ecommerce.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.app.dao.PurchaseDao;
import com.ecommerce.app.entity.Product;
import com.ecommerce.app.entity.Purchase;
import com.ecommerce.app.service.PurchaseService;

@Service
public class PurchaseServiceImpl implements PurchaseService{

	@Autowired
	PurchaseDao purchaseDao;
	
	@Override
	public Integer addUserPurchase(Integer userId, List<Product> cart) {
		return purchaseDao.addUserPurchase(userId, cart);
	}

	@Override
	public Purchase getPurchase(Integer purchaseOrder) {
		return purchaseDao.getPurchase(purchaseOrder);
	}

	@Override
	public List<Purchase> getAllUserPurchases(Integer userId) {
		return purchaseDao.getAllUserPurchases(userId);
	}

}
