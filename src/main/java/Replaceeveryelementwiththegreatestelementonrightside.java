
public class Replaceeveryelementwiththegreatestelementonrightside {
	
	public static void greatestelementonrightside(int arr[]) {
		int size=arr.length;
		int maz_right=arr[size-1];
		
		arr[size-1]=-1;
				for(int i=size-2;i<=0;i--) {
					
					int temp=arr[i];
					arr[i]=maz_right;
					if(maz_right<temp) {
						maz_right=temp;
					}
				}
				for(int i=0;i<size;i++) {
					System.out.println(arr[i]);
				}
	}

	public static void main(String[] args) {
		
		 int arr[] = {16, 17, 4, 3, 5, 2};
		 greatestelementonrightside(arr);

	}

}
