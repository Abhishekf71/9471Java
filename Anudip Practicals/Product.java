import java.util.Scanner;

public class Product
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number: ");
int num1 = sc.nextInt();
System.out.println("Enter second number: ");
int num2 = sc.nextInt();
System.out.println(num1 +" x "+ num2 + " = " +(num1*num2));
}
} 