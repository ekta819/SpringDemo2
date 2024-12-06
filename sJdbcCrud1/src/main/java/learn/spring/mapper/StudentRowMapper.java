package learn.spring.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import learn.spring.bean.Student;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student st=new Student();
		st.setRollno(rs.getInt("std_roll"));
		st.setName(rs.getString("std_name"));
		st.setMarks(rs.getInt("std_marks"));
		return st;
		
	}
	
	
	

}
