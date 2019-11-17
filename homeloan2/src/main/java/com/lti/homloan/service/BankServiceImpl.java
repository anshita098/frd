package com.lti.homloan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.homloan.dao.BankDAO;
import com.lti.homloan.model.Bank;
import com.lti.homloan.model.Bank;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	private BankDAO bankDAO;
	
	//@Override
		@Transactional
		public void saveBank(Bank theBank) {
			bankDAO.saveBank(theBank);
		}
		@Transactional
		public Bank getBank(int theId) {
			return bankDAO.getBank(theId);
		}
		
		@Transactional
		public List<Bank> getBank() {
	            return bankDAO.getBank();
		}
		
}
