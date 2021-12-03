import java.util.Scanner;

public class GettingUserName
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter username: ");
String user_name = sc.nextLine();
System.out.println("Your username is: "+user_name);
}
}