class EncapsulationDemo
{

private String name;
private int age;

public String getName()
{
return name;
}

public int getAge()
{
return age;
}
public String setName(String name)
{
name = name;
}

public int setAge(int age)
{
age = age;
} 
}

class EncapsulationTest
{
public static void main(String args[])
{
EncapsulationDemo obj = new EncapsulationDemo();
obj.setName("Abhishek");
obj.setAge(20);
obj.getName();
obj.getAge();
}
}