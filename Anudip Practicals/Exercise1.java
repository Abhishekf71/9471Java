import java.util.Scanner;
public class Exercise1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int num = sc.nextInt();
for(int i=1;i<=20;i++)
{
if(i==7 || i==15)
{
continue;
}
System.out.println(i);
}
}
}