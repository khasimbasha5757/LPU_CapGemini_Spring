package basic_of_spring_usingANNOTATIONS;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Autowired
	private List<String> list;
	
	
	public List<String> getList() {
		return list;
	}
	
	@Autowired
	private Map<Integer,String> map;
	
	
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Value("10")
	private int id;
	@Value("Khasim")
	private String name;
	@Value("10000")
	private int salary;
	public int getId() {
		return id;
	}
	public void setabc(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
