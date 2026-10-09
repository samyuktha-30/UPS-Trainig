import java.util.Scanner;

class demo3{
public static void main(String []args){
Scanner obj = new Scanner(System.in);
System.out.println("Enter your name: ");
String a = obj.nextLine();
System.out.println("Enter your age: ");
int b = obj.nextInt();

System.out.println("Your name is : " +a);
System.out.println("Your age is : " +b);
}
}