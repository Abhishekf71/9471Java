public class Test
{
int id;
String name;

public static void main(String args[])
{
Test obj1 = new Test();
Test obj2 = new Test();

obj1.id = 12;
obj1.name = "Abhishek";
System.out.println(obj1.id+" "+obj1.name);

System.out.println("--------------------");

obj2.id = 14;
obj2.name = "May";
System.out.println(obj2.id+" "+obj2.name);
}
}