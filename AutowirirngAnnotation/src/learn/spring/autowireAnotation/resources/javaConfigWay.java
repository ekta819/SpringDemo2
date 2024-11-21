package learn.spring.autowireAnotation.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import learn.spring.autowireAnotation.Address;
import learn.spring.autowireAnotation.Student;
import learn.spring.autowireAnotation.Subject;

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
		//stuJava.setSub(subj());
		return stuJava;
	}

	@Bean
	public Subject subj() {
		Subject sub1=new Subject();
		List<String> subList1=new ArrayList<String>();
		subList1.add("Englist");
		subList1.add("Math");
		subList1.add("Science");
		sub1.setSubject(subList1);
		//System.out.println(subList1.get(1));
		return sub1;
	}
	
	
}
