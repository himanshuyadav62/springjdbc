package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {

	public static void main(String[] args) {
		
		System.out.println("hello world");
		ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfig.class); 
		
		StudentDao st = context.getBean("studentDao",StudentDao.class);
//		Student student  = new Student(); 
//		student.setStudentId(2); 
//		student.setStudentCity("Jharoli"); 
//		student.setStudentName("anshu"); 
//		int count = st.insert(student); 
//		System.out.println(count);
		
		System.out.println("after get bean"); 
//		Student student = new Student(); 
//		student.setStudentName("anshu"); 
//		student.setStudentCity("begeechi"); 
//		int cnt = st.change(student); 
//		System.out.println(cnt);
		
		// delete from database; 
//		Student student= new Student(); 
//		student.setStudentName("Himasnhu"); 
//		int res = st.delete(student);
//		System.out.println(res);
//		

		// fetching data from database 
//		Student student = st.getStudent(2);
//		System.out.println(student);
	}

}
