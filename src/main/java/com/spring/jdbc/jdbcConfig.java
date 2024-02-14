package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.dao"})
public class jdbcConfig {
	@Bean("ds")
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource(); 
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUsername("root"); 
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setPassword("Himanshu@2001"); 
		return ds; 
	}
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource()); 
		return jdbcTemplate;
	}
//	@Bean("studentDao")
//	public StudentDao getStudentDao() {
//		StudentDaoImpl st = new StudentDaoImpl(); 
//		st.setJdbcTemplate(getJdbcTemplate());
//		return st;		
//	}
}
