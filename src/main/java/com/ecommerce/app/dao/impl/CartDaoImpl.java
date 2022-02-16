package com.ecommerce.app.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecommerce.app.dao.CartDao;
import com.ecommerce.app.dto.UserCartContainer;
import com.ecommerce.app.entity.Product;


@Repository
public class CartDaoImpl implements CartDao{

	static HashMap<Integer, List<Product>> shoppingCart = new HashMap<>();
	
	@Override
	public void addToCart(UserCartContainer userCartContainer) {
		
		if(shoppingCart.get(userCartContainer.getUserId()) == null) {
			List<Product> productsList = new ArrayList<>();
			shoppingCart.put(userCartContainer.getUserId(), productsList);
		}
		List<Product> productsList = shoppingCart.get(userCartContainer.getUserId());
		Product product = new Product();
		product.setProductId(userCartContainer.getProductId());
		product.setProductName(userCartContainer.getProductName());
		product.setProductCategory(userCartContainer.getProductCategory());
		product.setProductPrice(userCartContainer.getProductPrice());
		product.setProductQuantity(userCartContainer.getProductQuantity());
		productsList.add(product);
		
		shoppingCart.put(userCartContainer.getUserId(), productsList);
		//System.out.println(shoppingCart.size());
	}

	@Override
	public List<Product> viewCart(Integer userId) {
		return shoppingCart.get(userId);
	}

	@Override
	public void clearUserCart(int userId) {
		shoppingCart.remove(userId);
	}

}
