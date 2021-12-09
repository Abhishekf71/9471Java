
public class Array4 {

	public static void main(String[] args) {
		int[] arr = {3,6,10,4,55,12,44};
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		double avg = sum/(arr.length);
		System.out.println("Average: "+avg);

	}

}
