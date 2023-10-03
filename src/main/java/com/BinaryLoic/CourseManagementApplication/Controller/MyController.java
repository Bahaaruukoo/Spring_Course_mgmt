package com.BinaryLoic.CourseManagementApplication.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BinaryLoic.CourseManagementApplication.Service.CourseService;
import com.BinaryLoic.CourseManagementApplication.entities.Course;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MyController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public List<Course> getAllCources(){
		return courseService.getAllCourses();
	}
	
	@GetMapping("/courses/{id}")
	public Optional<Course> getCourseById(@PathVariable long id){
		return courseService.getCourseById(id);
	}
	
	@PostMapping("/courses")
	public void addCourse (@RequestBody Course course) {
		courseService.addCourse(course);
	}
	
	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Course course) {
		courseService.updateCourse(id, course);
	}
	
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable long id) {
		courseService.deleteCourseById(id);
	}
	@GetMapping("/coursesTitle/{title}")
	public List<Course> findAllByTitle(@PathVariable String title){
		return courseService.findAllByTitle(title);
	}
	@GetMapping("/coursesTitleStartWith/{title}")
	public List<Course> findByTitleUsingPattern(@PathVariable String title){
		return courseService.findAllByTitleLike(title);
	}
	@GetMapping("/courses/AllCourses")
	public List<Course> findAllCourses(){
		return courseService.findAllCourses();
	}
}
