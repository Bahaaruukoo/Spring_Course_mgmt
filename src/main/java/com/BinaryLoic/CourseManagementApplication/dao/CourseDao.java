package com.BinaryLoic.CourseManagementApplication.dao;
import com.BinaryLoic.CourseManagementApplication.entities.Course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Course, Long> {
	//custom Query
	public List<Course> findByTitle(String title);
	
	//JPQL
	@Query("select c from Course c where c.title like ?1%")
	public List<Course> findByTitleUsingAnything(String title);
	
	//Native
	@Query(
			value = "select * from course where id > 1",
			nativeQuery = true
			)
	public List<Course> findAllCourses();
	
}
