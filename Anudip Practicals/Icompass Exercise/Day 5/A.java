
interface A {
	public void method();
}
class One{
	public void method() {
		System.out.println("Class one method");
	}
}

class Two extends One implements A{
	public void method() {
		System.out.println("class two method");
	}
}


