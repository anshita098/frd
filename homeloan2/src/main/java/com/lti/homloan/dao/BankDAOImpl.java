package com.lti.homloan.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.homloan.model.Bank;


@Repository
public class BankDAOImpl implements BankDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveBank(Bank theBank) {
		Session currentSession=sessionFactory.getCurrentSession();
			currentSession.saveOrUpdate(theBank);
		}

	public List<Bank> getBank() {
	       Session session=sessionFactory.getCurrentSession();
	       //CriteriaBuilder is for defining condition,here it is optional
	       CriteriaBuilder cb=session.getCriteriaBuilder();
	       CriteriaQuery<Bank> cq=cb.createQuery(Bank.class);
	       //Here the SQL query is executed
	       Root<Bank> root=cq.from(Bank.class);
	       cq.select(root);
	       Query query=session.createQuery(cq);
	       return query.getResultList();
	}
  
	// @Override
	public Bank getBank(int theId)
	{
		
		Session currentSession=sessionFactory.getCurrentSession();
		Bank theBank=currentSession.get(Bank.class,theId);
	    return theBank;
	}

	public void deleteBank(int theId) {
		
	}

	

	

}
