package com.ecommerce.app.service;

import java.util.List;

import com.ecommerce.app.dto.UserCartContainer;
import com.ecommerce.app.entity.Product;

public interface CartService {

	void addToCart(UserCartContainer userCartContainer);

	List<Product> viewCart(Integer userId);

	void clearUserCart(int userId);

}
