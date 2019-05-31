package com.qa.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import com.qa.model.Account;

public class AccountRepoDB implements AccountRepo {
	
	@PersistenceUnit(unitName = "myPU")	
	private EntityManagerFactory emf; // = Persistance.createEntityManagerFactory("myPU"); //Need to inject this in
	
	public Account createAccount(Account account)
	{
		EntityManager manager = emf.createEntityManager();
		EntityTransaction et = manager.getTransaction();
		et.begin();
		manager.persist(account);
		et.commit();
		manager.close();
		return account;
		
	}
	
	public Account getAccount(int id)
	{
		return null;
	}
	
	public List<Account> getAccounts()
	{
		return null;
	}
	
	//u
	public Account updateName(int id, String newName)
	{
		return null;
	}
	
	//d
	public void deleteAccount(int id)
	{
		
	}

}
