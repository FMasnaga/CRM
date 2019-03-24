package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService cs;
	
	@GetMapping("/list")
	public String listCustomers(Model model) {
		List<Customer> customers = cs.getCustomers();
		model.addAttribute("customers",customers);
		return "list-customer";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd (Model theModel) {
		Customer c = new Customer ();
		theModel.addAttribute ("customer", c);
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer (@ModelAttribute("customer") Customer c) {
		cs.saveCustomer (c);
		
		return "redirect:/customer/list";
	}
	

	@GetMapping ("/showFormForUpdate")
	public String showFormForUpdate (@RequestParam("customerId") int id, Model theModel) {
		Customer c = cs.getCustomer (id);
		theModel.addAttribute("customer", c);
		return "customer-form";
	}
	
	
	@GetMapping ("/delete")
	public String showFormForDelete (@RequestParam("customerId") int id) {
		cs.deleteCustomer (id);
		return "redirect:/customer/list";
	}
}
