package com.infoscilabs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infoscilabs.model.Topic;
import com.infoscilabs.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	TopicService service;
	
	@RequestMapping(path="/topics" , method = RequestMethod.GET)
	public List<Topic> getAllTopics(){
		return service.getAllTopics();
	}
	
	@RequestMapping(path="/topics/{name}" , method = RequestMethod.GET)
	public Topic fetchTopic(@PathVariable String name){
		return service.fetchTopic(name);
	}
	
	@RequestMapping(path="/topics" , method = RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic){
		service.addTopic(topic);
	}
	
	@RequestMapping(path="/topics/{name}" , method = RequestMethod.PUT)
	public void updateTopic(@PathVariable String name, @RequestBody Topic topic){
		service.updateTopic(name , topic);
	}

	@RequestMapping(path="/topics/{name}" , method = RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String name){
		service.deleteTopic(name);
	}
}
