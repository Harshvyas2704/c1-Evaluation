package com.masai3;

public class Car {

	String model;
	String companyName;
	String color;
	Engine e1 = new Engine();
	
	void enableTurbo(boolean t) {
		e1.hasTurbo = t;
			System.out.println("Car has Turbo: " + e1.hasTurbo);
	}
	
	public Car() {
		
	}
	
	public static void main(String[] args) {
		
		Car c2 = new Car();
		
		c2.model = "SKYLINE: GTR34";
		c2.companyName = "Nishan";
		c2.color = "Blue-white";
		c2.e1.rmp = 10000;
		c2.e1.power = 1500;
		c2.e1.manufacture = "Nishan";
		System.out.println(c2.model);
		System.out.println(c2.companyName);
		System.out.println(c2.color);
		System.out.println(c2.e1.rmp);
		System.out.println(c2.e1.power);
		System.out.println(c2.e1.manufacture);
		c2.enableTurbo(true);
		
		
		
	}
}
