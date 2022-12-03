package com.spring.SpringEventHandling.Publishers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.spring.SpringEventHandling.Events.BBT;


@Component
public class Hotstar {

	@Autowired
	ApplicationEventPublisher publisher;
	
	public void publishingEvent(String epNo) {
		System.out.println("Publishing episode number: "+epNo);
		publisher.publishEvent(new BBT(epNo));

	}
	
}
