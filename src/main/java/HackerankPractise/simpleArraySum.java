package HackerankPractise;

public class simpleArraySum {
	public static int sumArray(int[] ar) {
		int arrayLength=ar.length;
		int sum=0;
		for(int i=0;i<arrayLength;i++) {
			sum+=ar[i];
			
		}
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		int[] data= {1,2,3,4,5,6};
		
		System.out.println(sumArray(data));

	}

}
