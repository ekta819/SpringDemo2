package learn.spring.javaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class stuMain {
    public static void main(String[] args) {

    	
    	ApplicationContext context =new AnnotationConfigApplicationContext(javaConfig.class);
    	Student student1= (Student)context.getBean("stu1");
    	System.out.println(student1);
		
    	Student student2= (Student)context.getBean("stu2"); 
		System.out.println(student2);



    }
}
