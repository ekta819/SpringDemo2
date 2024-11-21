package learn.spring.jdbc.NamedParameterJdbcDemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import learn.spring.jdbc.resource.SpringConfigFile;

/**
 * DB name ---> spring_jdbc_db
 * Table NAME ---> studet
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
        NamedParameterJdbcTemplate np=context.getBean(NamedParameterJdbcTemplate.class);
        
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("std_roll", 4);
        map.put("std_name", "Vinni");
        map.put("std_marks", 80.0f);
        
        String sql_query="INSERT INTO studet VALUES(:std_roll,:std_name,:std_marks)";
        int row=np.update(sql_query, map);
        if(row>0)
        	System.out.println("Insersion successful");
        else
        	System.out.println("Try Again");
        
        
    }
}
