package com.masai2;
import java.util.Scanner;
public class Course {

	int courseId;
	String courseName;
	int courseFee;
	
	void displayCourseDetails(int i, String n, int f) {
		// print all the details of the course
		System.out.println("You are geiing in " + n + " course");
		System.out.println("Your course id is " + i);
		System.out.println("Your course fee is " + f);
		
	}
	
	static void authenticate(String userName, String password) {
		
		String s1 = "Admin";
		String p = "1234";
		if(userName == s1 && password == p) {
			
			Course c1 = new Course();
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter Course Name");
			c1.courseName =  input.nextLine();
			
			System.out.println("Enter Course Id");
			c1.courseId = input.nextInt();
			
			System.out.println("Enter Course Fee");
			c1.courseFee = input.nextInt();
			
//			System.out.println(c1.courseFee);
			
			c1.displayCourseDetails(c1.courseId, c1.courseName, c1.courseFee);
			
		}
		else
			System.out.println("Invalid Username or password");
	}
	
	
	
	public static void main(String[] args) {
		
		authenticate("Admin", "1234");
		
		authenticate("Admin", "12345");
		
	}
}
