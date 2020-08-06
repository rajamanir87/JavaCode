package Java862020;

import java.util.Arrays;

import com.sun.tools.javac.code.Attribute.Array;

public class Anagram {

	public static void anagram(String str1,String str2) {
		
		boolean status=true;
		String arr1=str1.replaceAll("\\s", "");
		String arr2=str2.replaceAll("\\s", "");
		if(arr1.length()!=arr2.length()) {
			status=false;
		}
		else
		{
			char ch1[] = arr1.toLowerCase().toCharArray();
		    char ch2[]=arr2.toLowerCase().toCharArray();
		    Arrays.sort(ch1);
		    Arrays.sort(ch2);
		    status=Arrays.equals(ch1, ch2);
		}
		if(status){
			System.out.println(str1+" and "+ str2+ " are Anagram");
		}
		else
		{
			System.out.println(str1+" and "+ str2+ " are not Anagram");
		}
	}
	
	
	public static void main(String[] args) {
		
		anagram("joy","enjoy");
		anagram("hilter woman","mother in law");
		
	}

}
