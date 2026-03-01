package teluskoBasicSpring.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {
private String name;
private int strength;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStrength() {
	return strength;
}
public void setStrength(int strength) {
	this.strength = strength;
}

@Autowired
private Student student;
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
@Override
public String toString() {
	return "School [name=" + name + ", strength=" + strength + ", student=" + student + "]";
}

}
