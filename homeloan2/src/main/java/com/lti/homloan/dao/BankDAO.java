package com.lti.homloan.dao;

import java.util.List;

import com.lti.homloan.model.Bank;

public interface BankDAO {

	public void saveBank(Bank theBank);
	 
	public List<Bank> getBank();
	
	public Bank getBank(int theId);
	
	public void deleteBank(int theId);

}
