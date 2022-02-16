package com.ecommerce.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.app.dao.CartDao;
import com.ecommerce.app.dto.UserCartContainer;
import com.ecommerce.app.entity.Product;
import com.ecommerce.app.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartDao cartDao;
	
	@Override
	public void addToCart(UserCartContainer userCartContainer) {
		cartDao.addToCart(userCartContainer);
	}

	@Override
	public List<Product> viewCart(Integer userId) {
		return cartDao.viewCart(userId);
	}

	@Override
	public void clearUserCart(int userId) {
		cartDao.clearUserCart(userId);
	}

}
