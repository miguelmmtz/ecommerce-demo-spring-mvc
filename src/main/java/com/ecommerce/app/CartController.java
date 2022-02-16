package com.ecommerce.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ecommerce.app.dto.UserCartContainer;
import com.ecommerce.app.dto.UserId;
import com.ecommerce.app.entity.Product;
import com.ecommerce.app.service.CartService;
import com.ecommerce.app.service.PurchaseService;

@Controller
public class CartController {
	
	@Autowired
	CartService cartService;
	@Autowired
	PurchaseService purchaseService;
	
	@RequestMapping(value = "/addToCart", method = RequestMethod.POST)
	public String addProductToCart(@ModelAttribute UserCartContainer userCartContainer, 
			RedirectAttributes reqAtt) {
		cartService.addToCart(userCartContainer);
		reqAtt.addFlashAttribute("userId", userCartContainer.getUserId());
		return "redirect:/getProducts";
	}
	
	@RequestMapping(value = "/viewCart", method = RequestMethod.GET)
	public ModelAndView viewUserCart(@RequestParam Integer userId, ModelAndView modelAndView) {
		List<Product> cart = cartService.viewCart(userId);
		modelAndView.addObject("userId", userId);
		
		UserId userIdDto = new UserId();
		modelAndView.addObject("userIdDto", userIdDto);
		
		modelAndView.addObject("cart", cart);
		modelAndView.setViewName("cartview");
		return modelAndView;
	}
	
	@RequestMapping(value = "/purchaseCart", method = RequestMethod.POST)
	public String purchaseUserCart(ModelAndView modelAndView, 
			RedirectAttributes redAtt, 
			@ModelAttribute UserId userIdDto) {
		
		int userId = userIdDto.getUserId();
		System.out.println(userId);
		List<Product> cart = cartService.viewCart(userId);
		int purchaseOrder = purchaseService.addUserPurchase(userId, cart);
		cartService.clearUserCart(userId);
		redAtt.addFlashAttribute("purchaseOrder", purchaseOrder);
		return "redirect:/viewPurchases";
	}
	
}
