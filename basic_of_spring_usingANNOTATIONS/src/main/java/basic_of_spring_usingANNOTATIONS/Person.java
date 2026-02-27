package basic_of_spring_usingANNOTATIONS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;
@Component
public class Person {
	//Dependency injection
	//@Autowired
	private Mobile mobile;
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	@Autowired
	private Scanner scan;
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;
	}
	public void message() {
		System.out.println("Hiii");
	}
	public Person(Mobile mobile) {
		this.mobile=mobile;
	}
}