
public class ArrayExample {

	public static void main(String[] args) {
		double[] myList = {1.2,2.4,3.4,6.9};
		
		//printing all elements
		for(int i=0;i<myList.length;i++) {
			System.out.println(myList[i]+" ");
		}
		
		// all elements sum
		double total = 0;
		for(int i=0;i<myList.length;i++) {
			total+=myList[i];
		}
		System.out.println("Total: "+total);
		
		

	}

}
