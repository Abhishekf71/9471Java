import java.util.Scanner;
public class Cube
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number upto which cube is required :");
int num = sc.nextInt();
for(int i=1;i<=num;i++)
{
System.out.println("Number is "+i+"and cube of "+i+"is :"+(i*i*i));
}
}
}