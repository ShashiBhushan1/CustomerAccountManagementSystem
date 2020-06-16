package com.citi.repository;

import com.citi.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * AccountRepository java interface is extending the JpaRepository. 
 * 
 */
public interface AccountRepository extends JpaRepository<Account, Long> {

	Object findById(long id);

	void deleteById(long id);

}
