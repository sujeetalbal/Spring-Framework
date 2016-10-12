/**
 * 
 */
package com.cluster.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cluster.entity.Department;
import com.cluster.entity.Employee;
import com.cluster.service.BaseService;
import com.cluster.service.EmployeeService;

/**
 * @author Sujeet
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department dept = new Department();
		dept.setDname("HR");
		
		Employee emp1 = new Employee();
		emp1.setEname("vihsu");
		emp1.setEmail("vv@gmail.com");
		emp1.setDepartment(dept);
		
		Employee emp2 = new Employee();
		emp2.setEname("guru");
		emp2.setEmail("gu@gmail.com");
		emp2.setDepartment(dept);
		
		Set<Employee> s1 = new HashSet<Employee>();
		s1.add(emp1);
		s1.add(emp2);
		
		dept.setEmployees(s1);
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BaseService baseService = (BaseService) ac.getBean("employeeService");
		baseService.save(dept);
		System.out.println("sucess");

	}

}
