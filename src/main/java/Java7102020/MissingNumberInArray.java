package Java7102020;

public class MissingNumberInArray {

	static int missingNumber(int[] arr, int no) {

		int total;
		total = (no + 1) *( no + 2) / 2;
		for (int i = 0; i < arr.length; i++) {
			total -= arr[i];
		}
		return total;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 6, 7, 8, 9 };
		System.out.println(missingNumber(arr,arr.length));
	}

}
