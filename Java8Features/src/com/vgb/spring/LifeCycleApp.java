package com.vgb.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vgb.spring.bean.LifeCycle;

public class LifeCycleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		LifeCycle objectlc1 = (LifeCycle) context.getBean("lifeCycle");
		LifeCycle objectlc2 = (LifeCycle) context.getBean("lifeCycle");
		
		objectlc1.getCount();
		objectlc2.getCount();
		
		context.registerShutdownHook();
	}

}
