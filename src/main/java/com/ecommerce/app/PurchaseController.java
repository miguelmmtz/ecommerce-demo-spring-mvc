package com.ecommerce.app;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.app.entity.Purchase;
import com.ecommerce.app.service.PurchaseService;

@Controller
public class PurchaseController {
	
	@Autowired
	PurchaseService purchaseService;

	@RequestMapping(value = "/viewPurchases", method = RequestMethod.GET)
	public ModelAndView viewUserPurchases(ModelAndView modelAndView, Model model) {
		int purchaseOrder = Integer.parseInt(model.getAttribute("purchaseOrder").toString());
		Purchase purchase = purchaseService.getPurchase(purchaseOrder);
		modelAndView.addObject("purchase", purchase);
		modelAndView.setViewName("purchaseview");
		return modelAndView;
	}
	
	@RequestMapping(value = "/viewAllPurchases", method = RequestMethod.GET)
	public ModelAndView viewAllUserPurchases(ModelAndView modelAndView, @RequestParam Integer userId) {
		modelAndView.addObject("userId", userId);
		List<Purchase> allPurchasesByUser = purchaseService.getAllUserPurchases(userId);
		modelAndView.addObject("allPurchasesByUser", allPurchasesByUser);
		modelAndView.setViewName("userpurchasesview");
		return modelAndView;
	}
}
