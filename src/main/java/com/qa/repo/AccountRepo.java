package com.qa.repo;

import java.util.List;

import com.qa.model.Account;

public interface AccountRepo {

	//c
	public Account createAccount(Account account);
	
	//r
	public Account getAccount(int id);
	
	public List<Account> getAccounts();
	
	//u
	public Account updateName(int id, String newName);
	
	//d
	public void deleteAccount(int id);
	
}
