package com.vgb.spring.bean;

public class LifeCycle {
	private int count;
	
	public LifeCycle(){
		count ++;
		System.out.println("LifeCycle constructor");
	}
	
	public void init(){
		System.out.println("LifeCycle method : [init]");
	}

	public void destroy(){
		System.out.println("LifeCycle method : [destroy]");
	}
	
	public void setCount(int c){
		this.count = c;
	}
	
	public void getCount(){
		System.out.println("LifeCycle method : [getCount], "+count);
	}
}
