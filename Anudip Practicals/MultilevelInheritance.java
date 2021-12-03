class Animal
{
void eat()
{
System.out.println("eating");
}
}

class Dog extends Animal
{
void bark()
{
System.out.println("barking");
}
}

class BabyDog extends Dog
{
void weep()
{
System.out.println("weeping");
}
}
class MultilevelInheritance
{
public static void main(String args[])
{
BabyDog obj = new BabyDog();
obj.bark();
obj.eat();
obj.weep();
}
}