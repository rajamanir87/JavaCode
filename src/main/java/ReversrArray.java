
public class ReversrArray {
	public static void reversearray(int[] arr) {
		System.out.println("it is original");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("it is reverse");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		reversearray(arr);
		
	}

}
