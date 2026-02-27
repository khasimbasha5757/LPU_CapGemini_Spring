package basic_of_spring_usingANNOTATIONS;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Mobile {
	@Value("9997644788")
	private String number;
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
