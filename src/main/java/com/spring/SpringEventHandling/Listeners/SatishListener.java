package com.spring.SpringEventHandling.Listeners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.spring.SpringEventHandling.Events.BBT;

@Component
public class SatishListener {
	
	@EventListener
	public void streaming(BBT event) {
		System.out.println("Satish streaming BBT episode number: "+event.getEpNo());
	}
	
	@EventListener
	public void watching(BBT event) {
		System.out.println("Satish streaming BBT episode number: "+event.getEpNo());
	}
	

}
