import java.util.Scanner;

public class ToLowerCase {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter a string: ");
		String s = sc.nextLine();
		String modified = s.toLowerCase();
		System.out.println("Lowercase String: "+ modified);
				
		

	}

}
