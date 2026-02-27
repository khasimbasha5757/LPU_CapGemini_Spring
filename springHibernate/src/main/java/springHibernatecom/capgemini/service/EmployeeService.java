package springHibernatecom.capgemini.service;

import org.springframework.stereotype.Service;

import springHibernatecom.capgemini.dao.EmployeeDAO;
import springHibernatecom.capgemini.dto.Employee;

@Service
public class EmployeeService {	
	EmployeeDAO dao;
	public void insertEmployee(Employee e){
		if(dao.findById(e.getId())==null){
			dao.insert(e);
			}
	else{
	System.out.println("Data exists");
			}
	}
}