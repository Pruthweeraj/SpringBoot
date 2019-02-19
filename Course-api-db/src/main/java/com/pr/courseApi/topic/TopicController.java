package com.pr.courseApi.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	// Getting all topics
	@RequestMapping("/topics")
	public List<Topic> topics() {
		return topicService.allTopics();
	}

	// Getting Individual topics
	@RequestMapping("/topics/{id}")
	public Object topic(@PathVariable String id) {
		if (topicService.topic(id) != null) {
			return topicService.topic(id);
		} else {
			return "Topic Not Found";
		}
	}

	// Adding a topic
	@RequestMapping(value = "/topics", method = RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic) {
		System.out.println(topic);
		topicService.addTopic(topic);
	}

	// Updating a topic
	@RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
	public void updatetopic(@PathVariable String id, @RequestBody Topic topic) {
		topicService.updateTopic(id, topic);
	}

	// Deleting a topic
	@RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}

}