package com.tns_day8_FunctionalInterface;

public class FunctionalInterfaceDemo {
	
		public static void main(String[] args) {
			// traditional way
//			GreetClass obj = new GreetClass();
//			obj.greetings();
//			
			// Lambda Expression
			
			Greet g1 =() -> {System.out.println("Hello All");
			System.out.println("Lambda Expression");
			};
			
			g1.greetings();

		}

	}


