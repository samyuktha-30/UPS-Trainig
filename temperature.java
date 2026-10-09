package scannerpractice;
import java.util.*;

public class temperature {
	public static void main(String []args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter temperature in Celsius: ");
    double c = sc.nextDouble();
    double f = (c * 9 / 5) + 32;
    System.out.println("Temperature in Fahrenheit: " + f);

    System.out.print("Enter temperature in Fahrenheit: ");
    double  Fahrenheit = sc.nextDouble();
    double Celsius = (Fahrenheit - 32) * 5/9;
    System.out.println("Temperature in Celsius: " + Celsius);
}
}