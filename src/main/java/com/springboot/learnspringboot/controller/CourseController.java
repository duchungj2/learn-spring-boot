package com.springboot.learnspringboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learnspringboot.model.Course;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
			new Course(1, "Learn AWS", "test"),
			new Course(2, "Learn Spring Boot", "test"),
			new Course(3, "Learn JS", "test")
		);
	}
}
