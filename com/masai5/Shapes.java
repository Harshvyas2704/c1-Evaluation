package com.masai5;

public class Shapes {

	
	public void area(Circle circle) {
//		double ans = 3.14 * (circle*circle); 
		System.out.println(circle);
	}
	
	public void area(Rectangle rectangle) {
		
	}
	
	public void area(Square square) {
		
	}
	
	public static void main(String[] args) {
		
		
		Shapes s1 = new Shapes();
		Circle c1 = new Circle();
		c1.radius = 5;
//		s1.area(c1.radius);
	}

	/* static Polymorphism
	 Polymorphism is having same named method with multiple arguments,
	 which method to call is decide by it's priority.
	 
	 */
	
}
