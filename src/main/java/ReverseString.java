
public class ReverseString {

	public static void Reverse(String s) {

		int length = s.length();
		char[] ch=s.toCharArray();
		String rev="";
		for (int i = length - 1; i >= 0; i--) {
			rev=rev+ch[i];
			

		}
		System.out.println(rev);
	}

	public static void main(String[] args) {

		String data = "Rajamani";
		Reverse(data);
	}

}
