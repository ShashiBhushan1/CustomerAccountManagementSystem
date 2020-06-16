package com.citi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.citi.model.Account;
import com.citi.services.AccountService;


/**
 * 
 * ApplicationController java class is controller class containing the methods of 
 * all the methods viewHomePage(),showNewAccount(),saveAccount(),showEditAccount(),
 * and delete() account.
 *
 */

@Controller
public class ApplicationController {

	/**
	 * 
	 * AccountService instance of service class. 
	 *
	 */

	@Autowired
	private AccountService accountService; 

	/**
	 * viewHomePage() is for viewing the accounts. 
	 * @return String
	 * @param Model object
	 */

	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Account> listAccounts = accountService.listAll();
		model.addAttribute("listAccounts", listAccounts);
		return "index";
	}

	/**
	 * showNewAccountPage() is for show New Account. 
	 * @return String
	 * @param Model object
	 */

	@RequestMapping("/create")
	public String showNewAccountPage(Model model) {
		Account account = new Account();
		model.addAttribute("account", account);
		
		return "createAccount";
	}

	/**
	 * saveAccount() is for saving Account. 
	 * @return String
	 * @param Model object
	 */

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveAccount(@ModelAttribute("account") Account account) {
		accountService.save(account);
		
		return "redirect:/";
	}

	/**
	 * showEditAccountPage() is for editing the accounts. 
	 * @return ModelAndView
	 * @param id
	 */

	@RequestMapping("/edit/{id}")
	public String showEditAccountPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("editAccount");
		//Account account = accountService.get(id);
	//	mav.addObject("account", account);
		return "editAccount";
	}

	/**
	 * deleteAccount() is for deleting the accounts. 
	 * @return String
	 * @param id
	 */

	@RequestMapping("/delete/{id}")
	public String deleteAccount(@PathVariable(name = "id") int id) {
		accountService.delete(id);
		return "redirect:/";		
	}
}
