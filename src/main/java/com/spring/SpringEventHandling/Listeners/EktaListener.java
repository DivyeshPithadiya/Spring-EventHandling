package com.spring.SpringEventHandling.Listeners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.spring.SpringEventHandling.Events.BBT;

@Component
public class EktaListener {

	@EventListener
	public void streaming(BBT event) {
		System.out.println("Ekta streaming BBT episode number: "+event.getEpNo());
	}
	
}
