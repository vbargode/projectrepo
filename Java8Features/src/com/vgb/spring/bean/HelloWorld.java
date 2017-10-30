package com.vgb.spring.bean;

public class HelloWorld {
	
	private String message;

	public void getMessage() {
		System.out.println("HelloWorld[println] : " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
