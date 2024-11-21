package learn.spring.constructorInjection.resources;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import learn.spring.constructorInjection.Address;
import learn.spring.constructorInjection.Student;

@Configuration
public class javaConfigWay {
	
	@Bean
	public Address addr() {
		Address address1=new Address("Puru","WB",7070);
		return address1;
	}
	
	@Bean
	public Student stud() {
		Student student=new Student(777, "Venky", 20, addr());
		return student;
	}

}
