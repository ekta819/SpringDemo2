package learn.spring.AnnotationBasedConfig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class stuMain {
    public static void main(String[] args) {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext
    			    	("/learn/spring/AnnotationBasedConfig/resources/applicationContextCore1.xml");
    	Student student1= (Student)context.getBean("student");
    	
    	System.out.println(student1);
		 


    }
}
