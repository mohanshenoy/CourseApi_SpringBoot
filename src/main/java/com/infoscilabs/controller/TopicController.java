package com.infoscilabs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infoscilabs.model.Topic;

@RestController
public class TopicController {
	
	@RequestMapping(path="/topics" , method = RequestMethod.GET)
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<Topic>();
		
		Topic topic1 = new Topic(1,"java","java topics");
		Topic topic2 = new Topic(2,"spring","spring topics");
		Topic topic3 = new Topic(3,"dotnet","dotnet topics");
		topics.add(topic1);
		topics.add(topic2);
		topics.add(topic3);
		
		return  topics;
	}

}
