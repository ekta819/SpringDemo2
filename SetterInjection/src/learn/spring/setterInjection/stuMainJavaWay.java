package learn.spring.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import learn.spring.setterInjection.resources.javaConfigWay;

public class stuMainJavaWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new AnnotationConfigApplicationContext(javaConfigWay.class);
    	Student student1= (Student)context.getBean("stu");
    	System.out.println(student1);

	}

}
