//Q9
class SuperClass{
	int b = 10;
}

class SubClass extends SuperClass{
	int b = 20;
}
public class MainTest {
	public static void main(String[] args) {
		SuperClass object = new SubClass();
		System.out.println(object.b);
	}

}
