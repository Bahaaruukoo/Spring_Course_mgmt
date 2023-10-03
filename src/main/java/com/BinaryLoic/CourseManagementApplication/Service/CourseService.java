package com.BinaryLoic.CourseManagementApplication.Service;

import java.util.List;
import java.util.Optional;

import com.BinaryLoic.CourseManagementApplication.entities.Course;

public interface CourseService {

	List<Course> getAllCourses();

	Optional<Course> getCourseById(long id);

	void addCourse(Course course);

	void updateCourse(long id, Course course);

	void deleteCourseById(long id);

	List<Course> findAllByTitle(String title);

	List<Course> findAllByTitleLike(String title);

	List<Course> findAllCourses();

	
}
