/**
 * 
 */
package com.cluster.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Vishwanath
 *
 */
//@Component
@Repository
public class EmployeeDAOHibImpl implements BaseDAO {
	
	@Autowired
	public SessionFactory sessionFactory;

	
	public EmployeeDAOHibImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("inside default EmployeeDAOHibImpl" +sessionFactory);
	}
	
	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		System.out.println("inside EmployeeDAOHibImple");
		this.sessionFactory = sessionFactory;
	}



	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cluster.dao.BaseDAO#save(java.io.Serializable)
	 */
	public <T extends Serializable> void save(T iEntity) {
		// TODO Auto-generated method stub
		System.out.println("begin of EmployeeDAOHibImpl");
		getSession().beginTransaction().begin();
		getSession().save(iEntity);
		getSession().getTransaction().commit();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cluster.dao.BaseDAO#findAll()
	 */
	public <T extends Serializable> List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Session getSession(){
		Session openSession = sessionFactory.openSession();
		System.out.println("inside getSession " +openSession);
		return openSession;
	}

}
