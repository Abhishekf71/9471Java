import java.util.Scanner;

public class PositiveNegative
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number: ");
int num = sc.nextInt();
if (num == 0)
{
System.out.println("Number is neither positive or negative,it is zero ");
}
else if(num > 0)
{
System.out.println("Number is positive");
}
else
{
System.out.println("Number is negative");
}
}
}