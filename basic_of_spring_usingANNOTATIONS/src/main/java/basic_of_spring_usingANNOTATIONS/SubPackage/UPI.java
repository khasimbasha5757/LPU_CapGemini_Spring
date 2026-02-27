package basic_of_spring_usingANNOTATIONS.SubPackage;

import org.springframework.stereotype.Component;

@Component
public class UPI implements Payment{
	public void send() {
		System.out.println("Sent through UPI");
	}
}
