package com.citi.servicesImpl;

import java.util.List;
import com.citi.model.Account;

/**
 * AccountServiceImpl java interface contains all the methods implemented by 
 * AccountService() service class.
 */

public interface AccountServiceImpl {
	
	/**
	 * listAll() interface for showing the list of all account.
	 */
	public List<Account> listAll();	
	/**
	 * save() interface for saving the all account details.
	 */
	public void save(Account account);
	
	/**
	 * get() interface for getting all the account details.
	 */
	//	public Account get(long id);
	
	/**
	 * delete() interface for deleting the account by Id.
	 */
	public void delete(long id);
}
