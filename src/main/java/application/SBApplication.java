package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import application.rest.model.Employee;
import java.util.HashMap;

@SpringBootApplication
@ComponentScan(basePackages = {"application", "application.*", "com.ibm.javametrics.spring"})
public class SBApplication {

    public static HashMap<Long,Employee> hmEmployee=new HashMap<Long,Employee>();
	public static int empId = 1;
	
	static {
		Employee one=new Employee("Bhaskar","Technology Specialist", 10000, empId++);
		hmEmployee.put(new Long(one.getId()),one);
		Employee two=new Employee("Vinay","Senior Architect", 20000, empId++);
		hmEmployee.put(new Long(two.getId()),two);
	}


    public static void main(String[] args) {
        SpringApplication.run(SBApplication.class, args);
    }
}
