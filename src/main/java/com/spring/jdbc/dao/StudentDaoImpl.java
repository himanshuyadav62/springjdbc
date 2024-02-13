package com.spring.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate; 
	public int insert(Student student) {
		String query = "insert into student(id,name,city) value(?,?,?)"; 
		// execute query 
		int result = jdbcTemplate.update(query,student.getStudentId(),student.getStudentName(),student.getStudentCity());
		return result ;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
//	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int change(Student student) {
		String query = "update student set city =? where name=?"; 
		int res = jdbcTemplate.update(query,student.getStudentCity(),student.getStudentName()); 
		// number of rows have been changed
		return res; 
	}
	@Override
	public int delete(Student student) {
		String query = "delete from student where name=?"; 
		int res = jdbcTemplate.update(query,student.getStudentName()); 
		return res; 
	}
	
	@Override
	public Student getStudent(int studentId) {
		String query = "select * from student where id=?"; 
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student st = this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		return st; 
	}
}
