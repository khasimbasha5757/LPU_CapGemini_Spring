package springHibernatecom.capgemini.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springHibernatecom.capgemini.ProjectConfiguration;
import springHibernatecom.capgemini.dao.EmployeeDAO;
import springHibernatecom.capgemini.dto.Employee;

public class Main {
//	single ton->one object
public static void main(String[] args) {
	ApplicationContext ioc=new AnnotationConfigApplicationContext(ProjectConfiguration.class);
//	Employee e1=ioc.getBean(Employee.class);
//	Employee e2=ioc.getBean(Employee.class);
//	e1.setId(101);
//	e1.setName("Khasim");
//	e1.setSalary(1000000);
//	e2.setId(102);
//	e2.setName("Chotu");
//	e2.setSalary(40000);
//	EmployeeDAO dao=ioc.getBean(EmployeeDAO.class);
//	dao.delete(e1,101);
//	System.out.println(e1);
//	System.out.println(e2);
//	System.out.println(e1==e2);
}
}
