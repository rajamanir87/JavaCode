package Java7102020;

import java.util.Arrays;

public class MoveAllZerotoEndfTheArray {

	public static void moveAllTheZeroToEndOfTheArray(int array[], int no) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]!=0) {
			array[count++] = array[i];
			}
		}
		while (count < no) {
			array[count++] = 0;
		}
	}

	public static void reverseArray(int[] array, int no) {
		int i=0;
		int ar = 0;
		 int[] b = new int[no]; 
		for (i =array.length-1; i>=0; i--) {
			System.out.println(array[i]);
			
			
			}
		
	}
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 0, 4, 5, 0, 6, 0, 7, 0, 0, 8, 9, 0 };
		moveAllTheZeroToEndOfTheArray(array, array.length);
		
		System.out.println(Arrays.toString(array));
		reverseArray(array, array.length);
		//int[] ar=reverseArray(array, array.length);
		//System.out.println(Arrays.toString(ar));
		
	}

}
