package springHibernatecom.capgemini.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springHibernatecom.capgemini.dto.Employee;
import springHibernatecom.capgemini.main.JPAUtil;

@Repository
public class EmployeeDAO {
	@Autowired
	JPAUtil jpa;
	EntityManager em=jpa.getEntityManager();
	
	public void insert(Employee e) {
		em.getTransaction().begin();
		Employee employee=findById(e.getId());
		if(employee==null) {
			em.persist(e);
		}
		else {
			System.out.println("Data exist");
		}
		em.getTransaction().commit();
		}
	public void delete(Employee e,int id) {
		em.getTransaction().begin();
		Employee employee=findById(id);
		if(employee!=null && e.getId()==id) {
			em.remove(employee);
		}else {
			System.out.println("Data not found");
		}
		em.getTransaction().commit();
	}
	public Employee findById(int id) {
		return em.find(Employee.class,id);
	}
}
