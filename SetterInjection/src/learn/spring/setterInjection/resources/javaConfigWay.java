package learn.spring.setterInjection.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import learn.spring.setterInjection.Address;
import learn.spring.setterInjection.Student;

@Configuration
public class javaConfigWay {
	
	@Bean
	public Address addr() {
		Address adr1=new Address();
		adr1.setCity("Chandigarh");
		adr1.setState("Punjab");
		adr1.setHnum(6060);
		return adr1;
	}
	
	@Bean
	public Student stu() {
		Student stuJava=new Student();
		stuJava.setId(666);
		stuJava.setName("Shini");
		stuJava.setAge(23);
		stuJava.setAdr(addr());
		return stuJava;
	}

}
