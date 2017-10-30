package com.vgb.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vgb.spring.bean.HelloWorld;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Spring Object Scope Example [scope = singletone]");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld objectA = (HelloWorld) context.getBean("helloWorld");
		
		objectA.setMessage("I'm object A");
		
		objectA.getMessage();
		
		HelloWorld objectB = (HelloWorld) context.getBean("helloWorld");
		
		objectB.getMessage();
	}

}
