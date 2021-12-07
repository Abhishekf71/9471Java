import java.util.Scanner;

public class W3Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		double len = sc.nextDouble();
		System.out.println("Enter width: ");
		double width = sc.nextDouble();
		
		double area = len*width;
		double perimeter = 2*(len+width);
		
		System.out.println("Area of rectangle: "+ area);
		System.out.println("Perimenter of rectangle: "+ perimeter);

	}

}
