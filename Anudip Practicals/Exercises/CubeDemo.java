import java.util.Scanner;
public class CubeDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number upto which cube required: ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("Number is "+i+" and cube is "+(i*i*i));
		}
	}

}
