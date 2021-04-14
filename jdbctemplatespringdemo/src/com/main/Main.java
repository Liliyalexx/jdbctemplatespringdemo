package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDao;
import com.to.Employee;

public class Main {
public static void main (String[] args) {
	
	
	ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
	EmployeeDao Dao=(EmployeeDao)ap.getBean("edao");
	
	Employee e1 =new Employee();
	e1.setEid(103);
	e1.setEname("r");
	
	e1.setAge(40);
	
	e1.setPassword("yy");
	int count =Dao.addEmployee(e1);
	System.out.println(count + " records added");
}
}
