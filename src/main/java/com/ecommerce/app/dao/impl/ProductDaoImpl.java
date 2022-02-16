package com.ecommerce.app.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecommerce.app.dao.ProductDao;
import com.ecommerce.app.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	static List<Product> productsList = new ArrayList<>();
	
	public ProductDaoImpl() {
		Product product1 = new Product();
		product1.setProductId(1);
		product1.setProductName("iPhone 11");
		product1.setProductCategory("Phone");
		product1.setProductPrice(14999.99);
		product1.setProductQuantity(15.0);
		
		Product product2 = new Product();
		product2.setProductId(2);
		product2.setProductName("iPhone 12 Pro");
		product2.setProductCategory("Phone");
		product2.setProductPrice(22999.99);
		product2.setProductQuantity(22.0);
		
		Product product3 = new Product();
		product3.setProductId(3);
		product3.setProductName("Samsung Oven");
		product3.setProductCategory("Appliance");
		product3.setProductPrice(7999.99);
		product3.setProductQuantity(12.0);
		
		Product product4 = new Product();
		product4.setProductId(4);
		product4.setProductName("Mabe Washer");
		product4.setProductCategory("Appliance");
		product4.setProductPrice(6899.99);
		product4.setProductQuantity(7.0);
		
		Product product5 = new Product();
		product5.setProductId(5);
		product5.setProductName("Roku TV 40\"");
		product5.setProductCategory("Smart TV");
		product5.setProductPrice(8999.99);
		product5.setProductQuantity(9.0);
		
		productsList.add(product1);
		productsList.add(product2);
		productsList.add(product3);
		productsList.add(product4);
		productsList.add(product5);
	}
	
	@Override
	public List<Product> getProducts() {
		return productsList;
	}

	@Override
	public List<Product> getProductsByName(String productName) {
		
		for(Product product : productsList) {
			if(product.getProductName().equals(productName)) {
				return Arrays.asList(product);
			}
		}
		return null; 
	}
}
