package CodePractise;

public class MoveAllZeroToEnd {

	public static void main(String[] args) {
		int[] data= {1,0,3,0,9};
		int length=data.length;
		MoveAllZero(data,length);
		for(int i=0;i<length;i++) {
			System.out.println(data[i]);
		}
	}
public static void MoveAllZero(int[] arr,int n) {
	int count=0;
	
	for(int i=0;i<n;i++) {
		if(arr[i]!=0) {
			arr[count++]=arr[i];
		}
	}
	while(count<n) {
		arr[count++]=0;
		
	}
}
}
