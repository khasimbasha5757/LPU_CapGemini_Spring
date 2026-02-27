package basic_of_spring_usingANNOTATIONS.SubPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Autowired
	@Qualifier("UPI")
	private Payment payment;
	public void display() {
		payment.send();
	}
	public static void main(String[] args) {
		ApplicationContext ioc=new AnnotationConfigApplicationContext(DemoConfiguration.class);
		User u=ioc.getBean(User.class);
		System.out.println(u);
		u.display();
	}
}
