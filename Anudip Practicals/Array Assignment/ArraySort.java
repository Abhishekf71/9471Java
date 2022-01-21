import java.util.*;

public class ArraySort {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter array size: ");
int size = sc.nextInt();
int[] arr = new int[size];
System.out.println("Enter array values ");
for(int i = 0; i < size; i++) {
	arr[i] = sc.nextInt();
	}
Sort_asc(arr, size);
System.out.println("Array in ascending order: ");
for(int d : arr) {
	System.out.print(d + " ");
}
Sort_dsc(arr, size);
System.out.println();
System.out.println("Array in descending order: ");
for(int d : arr) {
	System.out.print(d + " ");
}
}

private static void Sort_asc(int[] arr, int size) {
	for(int i = 0; i < size; i++) {
		for(int j = 0 + i; j < size; j++) {
			int temp = 0;
			if(arr[i] > arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
	}
}
private static void Sort_dsc(int[] arr, int size) {
	for(int i = 0; i < size; i++) {
		for(int j = 0 + i; j < size; j++) {
			int temp = 0;
			if(arr[i] < arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
	}
}
}