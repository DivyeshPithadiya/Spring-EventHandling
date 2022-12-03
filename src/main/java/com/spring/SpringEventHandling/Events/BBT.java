package com.spring.SpringEventHandling.Events;

import org.springframework.stereotype.Component;

public class BBT {

	private String epNo;
	
	public BBT(String epNo) {
		super();
		this.epNo = epNo;
	}
	
	public BBT() {
		super();
	}

	public String getEpNo() {
		return epNo;
	}

	public void setEpNo(String epNo) {
		this.epNo = epNo;
	}
	
}
