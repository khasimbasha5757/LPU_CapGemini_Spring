package basic_of_spring_usingANNOTATIONS.SubPackage;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class creditCard implements Payment{
public void send() {
	System.out.println("Sent through credit card");
}
}
