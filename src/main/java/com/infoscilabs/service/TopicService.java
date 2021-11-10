package com.infoscilabs.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.infoscilabs.model.Topic;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<Topic>( Arrays.asList(
		new Topic("java","java topics"),
		new Topic("spring","spring topics"),
		new Topic("dotnet","dotnet topics"),
		new Topic("windows","windows topics"),
		new Topic("android","android topics")
		));
	
	public List<Topic> getAllTopics(){
		return topics;
	}

	public Topic fetchTopic(String name) {
		Topic topicTemp = null;
		for (int i = 0; i < topics.size(); i++) {
			Topic topic = (Topic) topics.get(i);
			if(topic.getName().equalsIgnoreCase(name)) {
				topicTemp= topic;
				continue;
			}
		}
		return topicTemp;
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String name, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic topicTemp = (Topic) topics.get(i);
			if(name.equalsIgnoreCase(topicTemp.getName())) {
				topics.set(i, topic);
				continue;
			}
		}
	}

	public void deleteTopic(String name) {
		for (int i = 0; i < topics.size(); i++) {
			Topic topicTemp = (Topic) topics.get(i);
			if(name.equalsIgnoreCase(topicTemp.getName())) {
				topics.remove(i);
				continue;
			}
		}
	}
}
