package scannerpractice;

import java.util.Scanner;

public class area {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("FOR RECTANGLE");
		System.out.println("Enter the value of 'a': ");
		int a = sc.nextInt();
		System.out.println("Enter the value of 'b': ");
		int b = sc.nextInt();	
		System.out.println("Area of Rectangle: " +(a*b));
		
		System.out.println("FOR SQUARE");
		System.out.println("Enter the value of 'c': ");
		int c = sc.nextInt();
		System.out.println("Area of Square: " +(c*c));
		
		
		System.out.println("FOR TRIANGLE");
		System.out.println("Enter the value of length: ");
		int d = sc.nextInt();
		System.out.println("Enter the value of breadth: ");
		int e = sc.nextInt();	
		int area = 1/2 * d * e;
		System.out.println("Area of Rectangle: " +(a*b));
		
	}

}
