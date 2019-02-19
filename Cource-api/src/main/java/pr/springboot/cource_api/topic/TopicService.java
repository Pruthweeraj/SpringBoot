package pr.springboot.cource_api.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("SE", "Java SE", "Java Standard Edition"),
			new Topic("EE", "Java EE", "Java Enterprice Edition"),
			new Topic("Spring", "Spring Framework", "Spring Framework DependancyInjection & Stand alone application")));

	// Getting all topics
	public List<Topic> allTopics() {
		return topics;
	}

	// Getting Individual topics
	public Topic topic(String id) {
		Iterator<Topic> topicItr = topics.iterator();
		while (topicItr.hasNext()) {
			Topic topic = topicItr.next();
			if (topic.getId().equalsIgnoreCase(id)) {
				return topic;
			}
		}
		return null;
	}

	// Adding a topic
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equalsIgnoreCase(id)) {
				topics.set(i, topic);
			}
		}
	}

	public void deleteTopic(String id) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equalsIgnoreCase(id)) {
				topics.remove(i);
			}
		}

	}

}
