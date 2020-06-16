package com.citi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.citi.model.Account;
import com.citi.repository.AccountRepository;


/**
 * AccountService java class is service class containing the methods of 
 * all business logic create account, edit account and delete account.
 */
@Service
@Transactional
public class AccountService {

	/**
	 * Instance of accountRepository.
	 */
	@Autowired
	private AccountRepository accountRepository;
	
	/**
	 * listAll() method for showing the list of all account.
	 */
	public List<Account> listAll() {
		return accountRepository.findAll();
	}
	
	/**
	 * save() method for saving the all account details.
	 */
	public void save(Account account) {
		accountRepository.save(account);
	}
	
	/**
	 * get() method for getting all the account details.
	 */
	//	public Account get(long id) {
	//		return accountRepository.findById(id).get();
	//	}
	
	/**
	 * delete() method for deleting the account by Id.
	 */
	public void delete(long id) {
		accountRepository.deleteById(id);
	}
}
