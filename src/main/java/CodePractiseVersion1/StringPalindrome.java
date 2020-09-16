package CodePractiseVersion1;

public class StringPalindrome {
	
	public static void palindrome(String str) {
		String original=str.replace(" ", "");
		String reverse="";
		for(int i=original.length()-1;i>=0;i--) {
			reverse+=original.charAt(i);
			
		}
		boolean Palindrome=true;
		for(int i=0;i<original.length();i++) {
			if(original.charAt(i)!=reverse.charAt(i))
			{
				Palindrome=false;
			}
		}
		if(Palindrome) {
			System.out.println("Yes it is Palidrome");
		}
		else {
			System.out.println(" it is Not Palidrome");
		}
	}

	public static void main(String[] args) {
		palindrome(" aba ");

	}

}
