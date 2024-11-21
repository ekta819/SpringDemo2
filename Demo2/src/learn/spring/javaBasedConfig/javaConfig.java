package learn.spring.javaBasedConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration 	//this indicates that the class is spring configurable
@Import(Address.class)
public class javaConfig {

//Method name represents the bean name or we can use @Bean("nameOfBean") to provide other name
	
	@Bean
	public Student stu1() {
		Student std1=new Student();
		std1.setId(333);
		std1.setName("Kayla");
		std1.setAge(35);
		std1.setAdr(adr1());
		return std1;
	}
	
	@Bean
	public Address adr1() {
		Address adrs1 =new Address();
		adrs1.setCity("Bhopal");
		adrs1.setState("MP");
		adrs1.setHnum(11111);
		return adrs1;
	}
	
	
	@Bean
	public Student stu2() {
		
		Student std2=new Student();
		std2.setId(444);
		std2.setName("Ramya");
		std2.setAge(30);
		std2.setAdr(adr2());
		return std2;
	}
	
	@Bean
	public Address adr2() {
		Address adrs1 =new Address();
		adrs1.setCity("Kolkata");
		adrs1.setState("WB");
		adrs1.setHnum(22222);
		return adrs1;
	}
	


}
