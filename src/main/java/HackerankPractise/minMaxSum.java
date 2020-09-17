package HackerankPractise;

public class minMaxSum {

	//int arr[]={1,3,5,7,9}
	//output=16 24
	//min=1+3+5+7=16
	//Max=3+5+7+9=24
	/*my approach
	1.first small value this array
	2.big value this array
	3.add or sum all value=total
	4.min=total-big
	5.max=total-small*/
	
	public static void minMaxSumValue(int[] arr) {
		int min,max,sum=0;
		min=arr[0];
		max=min;
		sum=min;
		for(int i=1;i<arr.length;i++) {
			sum+=arr[i];
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println((sum-max)+" "+(sum-min));
	}
	public static void main(String[] args) {
		int arr[]={1,3,5,7,9};
		minMaxSumValue(arr);

	}

}
