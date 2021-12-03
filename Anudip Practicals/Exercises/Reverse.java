import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a = sc.nextLine();
		String revString = "";
		int length = a.length();
		for(int i=length-1;i>=0;i--)
		{
			revString+=a.charAt(i);
		}
		System.out.println("Reversed String is: " + revString);
	}

}
