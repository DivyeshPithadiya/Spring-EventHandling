package com.spring.SpringEventHandling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.SpringEventHandling.Config.EventConfig;
import com.spring.SpringEventHandling.Publishers.Hotstar;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
		Hotstar hotstar = context.getBean(Hotstar.class);
		
		hotstar.publishingEvent("EP : 40");
		
		
	}

}
