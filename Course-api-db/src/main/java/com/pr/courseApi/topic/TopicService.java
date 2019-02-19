package com.pr.courseApi.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;

	// Getting all topics
	public List<Topic> allTopics() {

		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	// Getting Individual topics
	public Optional<Topic> topic(String id) {
		return topicRepository.findById(id);
	}

	// Adding a topic
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	// update topic
	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	// delete Topic
	public void deleteTopic(String id) {
		topicRepository.deleteById(id);

	}

	/*
	 * private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new
	 * Topic("SE", "Java SE", "Java Standard Edition"), new Topic("EE", "Java EE",
	 * "Java Enterprice Edition"), new Topic("Spring", "Spring Framework",
	 * "Spring Framework DependancyInjection & Stand alone application")));
	 * 
	 * // Getting all topics public List<Topic> allTopics() { return topics; }
	 * 
	 * // Getting Individual topics public Topic topic(String id) { Iterator<Topic>
	 * topicItr = topics.iterator(); while (topicItr.hasNext()) { Topic topic =
	 * topicItr.next(); if (topic.getId().equalsIgnoreCase(id)) { return topic; } }
	 * return null; }
	 * 
	 * // Adding a topic public void addTopic(Topic topic) { topics.add(topic); }
	 * //update topic public void updateTopic(String id, Topic topic) { for (int i =
	 * 0; i < topics.size(); i++) { Topic t = topics.get(i); if
	 * (t.getId().equalsIgnoreCase(id)) { topics.set(i, topic); } } } //delete Topic
	 * public void deleteTopic(String id) { for (int i = 0; i < topics.size(); i++)
	 * { Topic t = topics.get(i); if (t.getId().equalsIgnoreCase(id)) {
	 * topics.remove(i); } }
	 * 
	 * }
	 */

}
