class Test
{
private int data = 10;
private void msg()
{
System.out.println("Hello");
}
}

public class Private
{
public static void main(String args[])
{
Test obj = new Test();
System.out.println(obj.data);
obj.msg();
}
}