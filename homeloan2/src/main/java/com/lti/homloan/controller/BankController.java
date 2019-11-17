package com.lti.homloan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.lti.homloan.model.Bank;
import com.lti.homloan.service.BankService;

@Controller
@RequestMapping("/banker")
public class BankController {
	
	@Autowired
	private BankService userService;
	
	@GetMapping("showForm")
	public String showFormForAdd(ModelMap theModel) {
		Bank theBank=new Bank();
		//addAttribute will include all the property of Customer
		theModel.addAttribute("banker", theBank);
		return "bank-form";
	}

	@PostMapping("/saveBank")
	public String saveBank(@ModelAttribute("banker") Bank theBank)
	{ userService.saveBank(theBank);
	return "redirect:/banker/list";
	}
	
	@GetMapping("list")
	public String listBank(ModelMap theModel) {
		List<Bank> theBank=userService.getBank();
		//addAttribute will include all the property of Customer
		theModel.addAttribute("banker", theBank);
		return "list-bankers";
	}	

	
}
