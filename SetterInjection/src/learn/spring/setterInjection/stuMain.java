package learn.spring.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class stuMain {
    public static void main(String[] args) {

    	
    	ApplicationContext context =new ClassPathXmlApplicationContext
    			("/learn/spring/setterInjection/resources/applicationContextCore1.xml");
    	Student student1= (Student)context.getBean("stu1");
    	System.out.println(student1);
		
    	


    }
}
