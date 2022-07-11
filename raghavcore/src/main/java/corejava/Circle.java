package corejava;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// read the values from the keyboard
		Scanner sc = new Scanner(System.in);
		// declare variables
		int radius;
		double area;
		
		System.out.println("Enter the radius of circle");
		radius = sc.nextInt();
		
		// calcualte the area of the circle
		
		area = 3.141*radius*radius;
		
		//display the calcuated area
		
		System.out.println("The area is "+area);

	}

}
