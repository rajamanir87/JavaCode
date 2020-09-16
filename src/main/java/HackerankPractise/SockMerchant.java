package HackerankPractise;

import java.util.HashSet;

public class SockMerchant {

	public static int sockMerchant(int n,int[] ar) {
		int count=0;
		HashSet<Integer> set=new HashSet<Integer>();
	
		for(int i=0;i<n;i++) {
			int element=ar[i];
			if(set.contains(element)) {
				set.remove(element);
				count++;
				
			}
			else
				set.add(element);
			
		}
		return count;
		
	}
	public static void main(String[] args) {
		int[] data= {10,10,10,20,20,30,30,30,40,40,50,50,60,70,80};
		System.out.println(sockMerchant(15,data));
		

	}

}
