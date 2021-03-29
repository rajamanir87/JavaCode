import java.util.Arrays;
import java.util.Collections;

public class reverseArrya {
public static void reverse(Integer[] arr) {
	
	 
	   Collections.reverse(Arrays.asList(arr));
	   System.out.println(Arrays.asList(arr));
	   
}
	public static void main(String[] args) {
		
		Integer[] arr= {10,20,30};
		reverse(arr);
		int n=arr.length;
		reverseByCode(arr);
	}
	public static void reverseByCode(Integer[] arr) {
		int i,j,k=0;
		int n=arr.length;
		for(i =0;i<n/2;i++) {
			
			k=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=k;
		}
		for(j=0;j<n;j++) {
			System.out.println(Arrays.asList(arr[j]));
		}
		
	}
}
