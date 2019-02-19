package com.pr.courseApi.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pr.courseApi.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	// Getting all courses
	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> courses(@PathVariable String topicId) {
		return courseService.allCourses(topicId);
	}

	// Getting Individual course
	@RequestMapping("/topics/{topicId}/courses/{courseId}")
	public Object topic(@PathVariable String topicId , @PathVariable String courseId) {
		if (courseService.course(topicId , courseId) != null) {
			return courseService.course(topicId , courseId);
		} else {
			return "Course Not Found";
		}
	}

	// Adding a course
	@RequestMapping(value = "/topics/{topicId}/courses", method = RequestMethod.POST)
	public void addCourse(@PathVariable String topicId ,@RequestBody Course course) {
	 course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
	}

	// Updating a course
	@RequestMapping(value = "/topics/{topicId}/courses/{courseId}", method = RequestMethod.PUT)
	public void updateCourse(@PathVariable String topicId, @PathVariable String courseId, @RequestBody Course course ) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(course);
	}

	// Deleting a course
	@RequestMapping(value = "/topics/{id}/courses/{courseId}", method = RequestMethod.DELETE)
	public void deleteCourse(@PathVariable String courseId) {
		courseService.deleteCourse(courseId);
	}

}