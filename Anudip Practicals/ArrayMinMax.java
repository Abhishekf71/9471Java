
public class ArrayMinMax {

	static void min(int arr[])  //passing array 
	{
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
			
		}
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		int[] a = {10,20,5,12,6};
		min(a);
	}

}
