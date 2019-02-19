package com.pr.courseApi.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepository;

	// Getting all topics
	public List<Course> allCourses(String topicId) {

		List<Course> course = new ArrayList<Course>();
		courseRepository.findByTopicId(topicId)
		.forEach(course::add);
		return course;
	}

	// Getting Individual topics
	public Optional<Course> course(String topicId , String courseId) {
		return courseRepository.findById(courseId);
	}

	// Adding a Course
	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	// update Course
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	// delete Course
	public void deleteCourse(String courseId) {
		courseRepository.deleteById(courseId);

	}

	

}
