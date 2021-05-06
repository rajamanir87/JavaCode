package sorting;

public class BinearSearch {
public static int BinearSearchCode(int[] arr,int key,int start,int end) {
		
		int mid;
		while(start<=end) {
			mid=(start+end)/2;
			if(arr[mid]==key) {
				
				return 1;
				
			}
			else if(arr[mid]<key) {
				mid=mid+1;
			}
			else
				mid=mid-1;
		}
		
		return 0;
		
	}
	

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		
		int key=2;
		
		if((BinearSearchCode(arr,key,0,arr.length-1))==1) {
			System.out.println("Key found");
			
		}
		else {
			System.out.println("Key not found");
		}

	}
	}

