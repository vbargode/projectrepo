package com.vgb.java8.foreach;

public class Java8LambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Runnable anonymous class with classic example
		/*Runnable r = new Runnable(){
			@Override
			public void run() {
				System.out.println("My Runnable");
			}};*/
		
		/*Runnable r = () -> {
			System.out.println("testing environment...!");
		};*/
		
		
		Runnable r = () -> System.out.println("Test Message...!");
		
		r.run();
	}
}
