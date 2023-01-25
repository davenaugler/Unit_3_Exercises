package com.coderscampus.objects;

public class RunnableClass {

	public static void main(String[] args) {
		// Class -> Blueprint for an object -- Everything in Java is an object, except primitives
		// Object -> is a Noun, it's an instantiations of a Class
		
		// Data type, variable name, assignment operation
		Human daveNaugler = new Human();
		
		daveNaugler.name = "Dave Naugler";
		daveNaugler.eyeColor = "hazel";
		daveNaugler.gender = "male";
		daveNaugler.height = "5'8\"";
		daveNaugler.weight = "200";
		
		System.out.println(daveNaugler.getInfo());
		
		Human elonMusk = new Human();
		elonMusk.name = "Elon Musk";
		elonMusk.eyeColor = "blue";
		elonMusk.gender	= "male";
		elonMusk.height = "6'1\"";
		elonMusk.weight = "190";
		
		System.out.println(elonMusk.getInfo());
		
		
		
		
		
		
		
		

	}

}
