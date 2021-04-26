package sorting;

public class BubbleSort {

	
	public static int[] bubblesort(int[] list) {
		
		int i,j,temp=0;
		for(i=0;i<list.length-1;i++) {
			for(j=0;j<list.length-1-i;j++) {
				if(list[j]>list[j+1]) {
					temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
					
				}
			}
			
		}
		
		return list;
		
	}
	public static void main(String[] args) {
		int[] data= {5,1,9,8,7,4,3,2};
		bubblesort(data);
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		
		
	}

}
