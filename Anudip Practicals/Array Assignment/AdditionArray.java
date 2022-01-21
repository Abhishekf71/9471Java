import java.util.Scanner;

public class AdditionArray {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter arr1 row : "); 
			int row1 = sc.nextInt();
			System.out.print("Enter arr1 column : "); 
			int column1 = sc.nextInt();
			int[][] arr1 = new int[row1][column1];
			System.out.println("Enter array1 elements: ");
			for(int i = 0; i < row1; i++) {
				for(int j = 0; j < column1; j++) {
					arr1[i][j] = sc.nextInt();
				}
			}
			
			System.out.print("Enter arr2 row : "); 
			int row2 = sc.nextInt();
			System.out.print("Enter arr2 column : "); 
			int column2 = sc.nextInt();
			int[][] arr2 = new int[row2][column2];
			System.out.println("Enter array2 elements: ");
			for(int i = 0; i < row2; i++) {
				for(int j = 0; j < column2; j++) {
					arr2[i][j] = sc.nextInt();
				}
			}
	
			int[][] add_arr = new int[row1][column1];
			for(int i = 0; i < row1; i++) {
				for(int j = 0; j < column1; j++) {
					add_arr[i][j] = arr1[i][j] + arr2[i][j];
				}
			}
			System.out.println("Addition of  Matrices: ");
			for(int i = 0; i < row1; i++) {
				for(int j = 0; j < column1; j++) {
					System.out.print(add_arr[i][j] + " ");
				}
					System.out.println();
			}
	}
}