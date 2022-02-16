package com.ecommerce.app.dao;

import java.util.List;

import com.ecommerce.app.entity.Product;

public interface ProductDao {

	List<Product> getProducts();

	List<Product> getProductsByName(String productName);

}
