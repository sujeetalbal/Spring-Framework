/**
 * 
 */
package com.cluster.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cluster.dao.BaseDAO;

/**
 * @author Vishwanath
 *
 */
//@Component
@Service
public class EmployeeService implements BaseService {
	
	@Autowired
	public BaseDAO baseDAO;
	
	public EmployeeService() {
		// TODO Auto-generated constructor stub
		System.out.println("inside default contrucotur EmployeeService" +baseDAO);
	}
	/**
	 * @return the baseDAO
	 */
	public BaseDAO getBaseDAO() {
		return baseDAO;
	}

	/**
	 * @param baseDAO the baseDAO to set
	 */
	public void setBaseDAO(BaseDAO baseDAO) {
		System.out.println("inside setBaseDAO() of EmployeeService");
		this.baseDAO = baseDAO;
	}

	/* (non-Javadoc)
	 * @see com.cluster.service.BaseService#save(java.io.Serializable)
	 */
	public <T extends Serializable> void save(final T iEntity) {
		System.out.println("begin of EmployeeService");
		// TODO Auto-generated method stub
		baseDAO.save(iEntity);
	}

	/* (non-Javadoc)
	 * @see com.cluster.service.BaseService#findAll()
	 */
	public <T extends Serializable> List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
