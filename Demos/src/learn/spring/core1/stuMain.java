package learn.spring.core1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class stuMain {
    public static void main(String[] args) {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext
    			("/learn/spring/resources/applicationContextCore1.xml");
    	
    	List<Student> list=new ArrayList<Student>();
    	Student student1= (Student)context.getBean("stu1");
    	Student student2= (Student)context.getBean("stu2");
    	list.add(student1);
    	list.add(student2);
    	System.out.println(list.get(0));
    	System.out.println(list.get(1));
		 


    }
}
