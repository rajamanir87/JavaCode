package CodePractise;

import java.util.Arrays;

import com.sun.tools.javac.code.Attribute.Array;

public class Stringanagram {

	public static void main(String[] args) {
		
		anagram("joy","enjoy");
		anagram("hilter woman","mother in law");
	}
public static void anagram(String str1,String str2) {
	boolean status=true;
	
	String data1=str1.replaceAll("\\s", "");
	String data2=str2.replaceAll("\\s", "");
	if(data1.length()!=data2.length()) {
		status=false;
	}
	else {
		char[] ch1=data1.toLowerCase().toCharArray();
		char[] ch2=data2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		status=Arrays.equals(ch1,ch2);
		
	}
	if(status) {
		System.out.println("it is anagram ");
		
	}
	else
	{
		System.out.println("it is not  anagram ");
	}
	
	
}
}
