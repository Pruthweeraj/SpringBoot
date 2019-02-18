package pr.springboot.cource_api.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			new Topic("SE" ,"Java SE" , "Java Standard Edition"),
			new Topic("EE" ,"Java EE" , "Java Enterprice Edition"),			
			new Topic ("Spring" , "Spring Framework" , "Spring Framework DependancyInjection & Stand alone application")
			);
	
	
	public List<Topic> allTopics(){
		return topics;
	}
	
}
