package basic_of_spring_usingANNOTATIONS;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
public static void main(String[] args) {
	ApplicationContext ioc=new AnnotationConfigApplicationContext(DemoConfiguration.class);
	
//	Employee e=ioc.getBean(Employee.class);
////	System.out.println(e);
//	System.out.println(e.getId());
////	Person p=ioc.getBean(Person.class);
////	System.out.println(p);
//	System.out.println(e.getName());
//	System.out.println(e.getSalary());
	Person person=ioc.getBean(Person.class);
//	System.out.println(person);
//	System.out.println(person.getMobile());
//	System.out.println(ioc.getBean(Mobile.class));
//	System.out.println(person.getScan());
//	List<String> list=ioc.getBean(List.class);
//	System.out.println(list);
	
	
	Map<Integer,String> map=ioc.getBean(HashMap.class);
	map.put(1,"chotu");
	map.put(2, "Khasim");
	System.out.println(map);
}
}