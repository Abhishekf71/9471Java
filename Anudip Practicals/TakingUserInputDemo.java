import java.util.Scanner;

public class TakingUserInputDemo
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string: ");
String s = sc.nextLine();
System.out.println("Given string is: "+s);
}
}