package CodePractiseVersion1;

public class MoveAlltheZeroToEnd {

	public static void main(String[] args) {
		int[] data= {1,0,2,0,3,0,4,0,5,0};
		int length=data.length;
		int count=0;
		for(int i=0;i<length;i++) {
			if(data[i]!=0)
			data[count++]=data[i];
		}
		while(count<length) {
			data[count++]=0;
		}
		for(int i=0;i<length;i++) {
			System.out.println(data[i]);
		}
	}

}
