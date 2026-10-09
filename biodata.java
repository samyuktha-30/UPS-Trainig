package scannerpractice;
import java.util.*;

public class biodata {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String a = sc.nextLine();
		System.out.println("Enter your reg-no: ");
		long b = sc.nextLong();
		System.out.println("Enter your age: ");
		short c = sc.nextShort();
		sc.nextLine();
		System.out.println("Enter your department: ");
		String d = sc.nextLine();
		System.out.println("Enter your phone number: ");
		long e = sc.nextLong();
		sc.nextLine();
		
		System.out.println("-------------------Your details----------------- ");
		System.out.println("Your name is : " +a);
		System.out.println("Your reg-no is : " +b);
		System.out.println("Your age is : " +c);
		System.out.println("Your deaprtment is : " +d);
		System.out.println("Your phone number is : " +e);
		
				
	}

}
