package corejava;

import java.util.Scanner;

public class Mathematics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. we have to read values from keyboard
		Scanner sc = new Scanner(System.in);
		
		//2. declare the required variables
		
		int a,b,sum,diff, prod;
		float quot;
		
		//3. read the first value from the keyboard
		System.out.println("Enter first value");
		a= sc.nextInt();
		
		//4. read the second value from the keyboard
		System.out.println("Enter second value");
		b= sc.nextInt();
		
		
	// 5. calculate the arthimetic operations
		
		sum=a+b;
		diff =a-b;
		prod= a*b;
		quot = a/b;
		
	// 6. display the results
		
		System.out.println("The sum is :"+sum);
		System.out.println("The difference is : "+diff);
		System.out.println("The product is : "+prod);
		System.out.println("The quotient is:"+quot);
		
		
		
		

	}

}
