package com.ecommerce.app.dao;

import java.util.List;

import com.ecommerce.app.dto.UserCartContainer;
import com.ecommerce.app.entity.Product;

public interface CartDao {

	void addToCart(UserCartContainer userCartContainer);

	List<Product> viewCart(Integer userId);

	void clearUserCart(int userId);

}
