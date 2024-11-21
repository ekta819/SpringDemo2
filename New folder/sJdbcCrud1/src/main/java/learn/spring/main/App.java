package learn.spring.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import learn.spring.bean.Student;
import learn.spring.mapper.StudentRowMapper;
import learn.spring.resources.SpringConfigFile;

//Here DB is connected using JdbcTemplate

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		JdbcTemplate jdbcTemp = context.getBean(JdbcTemplate.class);
		
		//------------------------INSERT--------------------------
		/*int std_roll = 3;
		String std_name = "Jiya";
		float std_marks = 87.2f;
		String sql_query = "INSERT INTO studet VALUES (?,?,?)";
		int row = jdbcTemp.update(sql_query, std_roll, std_name, std_marks);
		if (row > 0) {
			System.out.println("Insertion Succesful ");
		} else {
			System.out.println("Try Again !! ");
		}*/
		
		//------------------------UPDATE------------------------
		/*int std_roll=2;
		float std_marks=85f;
		String sql_query2="UPDATE studet SET std_marks=? WHERE std_roll=?";
		int row=jdbcTemp.update(sql_query2,std_marks,std_roll);
		if (row > 0) {
			System.out.println("Updation Succesful ");
		} else {
			System.out.println("Try Again !! ");
		}*/
		
		//---------------------DELETE----------------------------
		
		
	/*	int std_roll=2;
		String sql_query3="DELETE from studet WHERE std_roll=?";
		int row=jdbcTemp.update(sql_query3,std_roll);
		if (row > 0) {
			System.out.println("Deletion Succesful ");
		} else {
			System.out.println("Try Again !! ");
		}*/
		
		
		/*
		//-----------------------SELECT OPERATION 01 ---------------------
		//In case of select query, we've to create a bean (Student) class and a 
		//Customized RowMapper class (StudentRowMapper
		String select_sql_query="SELECT * from studet";
		
		List<Student> std_list=jdbcTemp.query(select_sql_query, new StudentRowMapper()); //always use query-RowMapper
		
		for(Student s : std_list) {
			System.out.println("Roll no : "+s.getRollno());
			System.out.println("Name : "+s.getName());
			System.out.println("Marks : "+s.getMarks());
			System.out.println("-------------------------------------------------");
		}*/
		
		//-----------------------SELECT OPERATION 02---To get 1 particular data------------------
		int rollno=2;
		String select_sql_query="SELECT * from studet where std_roll=?";
		Student std_value=jdbcTemp.queryForObject(select_sql_query, 
				new StudentRowMapper(),rollno); //always use query-RowMapper
		
		System.out.println("Roll no : "+std_value.getRollno());
		System.out.println("Name : "+std_value.getName());
		System.out.println("Marks : "+std_value.getMarks());
		System.out.println("-------------------------------------------------");
		

	}
}
