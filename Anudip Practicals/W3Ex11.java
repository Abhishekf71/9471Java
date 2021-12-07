import java.util.Scanner;

public class W3Ex11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius: ");
		double rad = sc.nextDouble();
		double area = 3.14*rad*rad;
		double perimeter = 2*3.14*rad;
		System.out.println("Area: "+ area +" Perimeter: "+ perimeter);
	}

}
