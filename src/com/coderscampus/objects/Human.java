package com.coderscampus.objects;
// ------ //
// Class  //
// ------ //
public class Human {
	String name;
	String gender;
	String height;
	String weight;
	String eyeColor;
	
	
	// ------ //
	// Method //
	// ------ //
	// (visibility modifier), return type, method name, parameters, specify scope
	String getInfo () {
		return "Hi, my name is " + name + ". I am a " + height + " " + gender + " with " +
				eyeColor + " eye's and I weigh " + weight + "lbs.";
		
	}
	
}


