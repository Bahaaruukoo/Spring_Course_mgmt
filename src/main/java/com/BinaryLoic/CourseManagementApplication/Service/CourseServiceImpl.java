package com.BinaryLoic.CourseManagementApplication.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BinaryLoic.CourseManagementApplication.dao.CourseDao;
import com.BinaryLoic.CourseManagementApplication.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getAllCourses() {
		return courseDao.findAll();
	}

	@Override
	public Optional<Course> getCourseById(long id) {
		Optional<Course> result = courseDao.findById(id);
		return result.isPresent()? result:null;
	}

	@Override
	public void addCourse(Course course) {
		courseDao.save(course);
		
	}

	@Override
	public void updateCourse(long id, Course course) {
		Optional<Course> result = getCourseById(id);
		if(result.isPresent()) {
			course.setId(id);
			courseDao.save(course);
		}
		
	}

	@Override
	public void deleteCourseById(long id) {		
		Optional<Course> result = getCourseById(id);
		if(result.isPresent()) {
			courseDao.deleteById(id);
		}
		
	}

	@Override
	public List<Course> findAllByTitle(String title) {
		courseDao.findByTitle(title);
		return null;
	}

	@Override
	public List<Course> findAllByTitleLike(String title) {
		return courseDao.findByTitleUsingAnything(title);
	}

	@Override
	public List<Course> findAllCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAllCourses();
	}

}
