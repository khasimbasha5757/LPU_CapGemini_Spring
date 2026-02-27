package basic_of_spring_usingANNOTATIONS;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="basic_of_spring_usingANNOTATIONS")
public class DemoConfiguration {
	@Bean("scan1")
	public Scanner getScanner() {
	return new Scanner(System.in);
	}
	@Bean
	public List<String> getabc(){
		return List.of("Miller","Brevas","Holder");
	}
	@Bean
	public Map<Integer,String> getMap(){
		return new HashMap<>();
	}
} 