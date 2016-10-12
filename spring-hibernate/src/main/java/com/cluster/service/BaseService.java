/**
 * 
 */
package com.cluster.service;

import java.io.Serializable;
import java.util.List;

/**
 * @author Vishwanath
 *
 */
public interface BaseService {
	
public <T extends Serializable> void save(final T iEntity);
	
	public <T extends Serializable> List<T> findAll();

}
