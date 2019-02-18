package pr.springboot.cource_api.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {


	@RequestMapping("/topics")
	public List<Topic> topics(){
		return Arrays.asList(
				new Topic("SE" ,"Java SE" , "Java Standard Edition"),
				new Topic("EE" ,"Java EE" , "Java Enterprice Edition"),			
				new Topic ("Spring" , "Spring Framework" , "Spring Framework DependancyInjection & Stand alone application")
				);
	}
	
}
