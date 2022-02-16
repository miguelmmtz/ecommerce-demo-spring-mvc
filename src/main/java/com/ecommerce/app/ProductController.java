package com.ecommerce.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.app.dto.UserCartContainer;
import com.ecommerce.app.dto.UserId;
import com.ecommerce.app.entity.Product;
import com.ecommerce.app.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/getProducts", method = RequestMethod.GET)
	public ModelAndView getAllProducts(ModelAndView modelAndView, Model model) {
		
		//System.out.println(model.getAttribute("userId").toString());
		
		List<Product> productsList = productService.getProductsList();
		modelAndView.addObject("productsList", productsList);
		
		UserCartContainer ucc = new UserCartContainer();
		modelAndView.addObject("userCartContainer", ucc);
		
		UserId userIdDto = new UserId();
		modelAndView.addObject("userIdDto", userIdDto);
		
		modelAndView.setViewName("productsview");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/getProduct", method = RequestMethod.GET)
	public ModelAndView getProductByName(@RequestParam("productName") String productName,
			ModelAndView modelAndView, @ModelAttribute UserId userIdDto) {
		
		modelAndView.addObject("userId", userIdDto.getUserId());
		
		List<Product> productsList = productService.getProductsByName(productName);
		modelAndView.addObject("productsList", productsList);
		
		UserCartContainer ucc = new UserCartContainer();
		modelAndView.addObject("userCartContainer", ucc);
		
		modelAndView.setViewName("productsview");
		
		return modelAndView;
	}
}
