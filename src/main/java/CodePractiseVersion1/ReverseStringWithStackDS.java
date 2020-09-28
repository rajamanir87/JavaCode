package CodePractiseVersion1;

import java.util.Stack;

public class ReverseStringWithStackDS {

	public static void reverserString(String str) {
		Stack dataStack=new Stack();
		int length=str.length();
		for(int i=0;i<length;i++) {
			char data=str.charAt(i);
			
			dataStack.push(data);
		}
		String result="";
		while(!dataStack.isEmpty()) {
			char isDayta= (Character) dataStack.pop();
			result+=isDayta;
			
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverserString("Rajamani");
	}

}
