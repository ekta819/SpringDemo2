package learn.spring.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learn.spring.constructorInjection.Student;
import learn.spring.constructorInjection.resources.javaConfigWay;

public class stuMainJavaConfigWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context =new AnnotationConfigApplicationContext(javaConfigWay.class);
    	Student student1= (Student)context.getBean("stud");
    	System.out.println(student1);


	}

}
