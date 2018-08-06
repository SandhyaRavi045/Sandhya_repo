package org.cap.demo;

public class MainClass {

	public static void main(String [] args) {
		SalesClass sales=new SalesClass();
		System.out.println("Hello world");
		greet();
		sales.show();
	}
	
	public static void greet() {
		System.out.println("Welcome");
		System.out.println("Hello");
		System.out.println("Jerry");
	}
}
