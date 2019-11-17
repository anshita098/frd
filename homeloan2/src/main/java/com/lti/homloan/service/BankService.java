package com.lti.homloan.service;

import java.util.List;

import com.lti.homloan.model.Bank;

public interface BankService {

	public void saveBank(Bank theBank);

	public Bank getBank(int theId);
	
	public List<Bank>getBank();
	
}
