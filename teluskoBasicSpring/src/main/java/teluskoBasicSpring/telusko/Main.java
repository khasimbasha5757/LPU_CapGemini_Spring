package teluskoBasicSpring.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ioc=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Student s=ioc.getBean(Student.class);
		s.setId(101);
		s.setName("Khasim");
		s.setEmail("Khasim@gmail.com");
//		System.out.println(s);
		School sch=ioc.getBean(School.class);
		sch.setStudent(s);
		sch.setName("RR HIGH SCHOOL");
		sch.setStrength(400);
		System.out.println(sch);
//		System.out.println(sch.getName()+sch.getStrength()+sch.getStudent());
	}
}
