package sorting;

public class LinearSearch {
	
	public static int LinearSearchCode(int[] arr,int key) {
		
		int size=arr.length;
		for(int i=0;i<size;i++) {
			if(arr[i]==key)
				return -1;
			
		}
		return 0;
		
	}

	public static void main(String[] args) {
		int[] arr= {1,4,5,6,19,11,10};
		int key=10;
		
		if((LinearSearchCode(arr,key))==-1) {
			System.out.println("Key found");
			
		}
		else
			System.out.println("Key not found");

	}

}
