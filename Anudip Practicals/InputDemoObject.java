import java.util.Scanner;

public class InputDemoObject
{
int i;
double d;
String s;
float f;

void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter any int value: ");
i = sc.nextInt();
System.out.println("Enter any double value: ");
d = sc.nextDouble();
System.out.println("Enter any String value: ");
s = sc.nextLine();
System.out.println("Enter any Float value: ");
f = sc.nextFloat();

System.out.println(" Float value: "+f);
System.out.println(" int value: "+i);
System.out.println(" String value: "+s);
System.out.println(" Double value: "+d);
}

public static void main(String args[])
{
InputDemoObject obj1 = new InputDemoObject();
obj1.input();
}
}

