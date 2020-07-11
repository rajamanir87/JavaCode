package Java8102020;

public class PermutationInString {
public static void PermutatioData(String str,String ans) {
	if(str.length()==0) {
		System.out.println(ans+"");
		return;
	}
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		String data=str.substring(0,i)+str.substring(i+1);
		PermutatioData(data,ans+ch);
		
	}
}
	public static void main(String[] args) {
		PermutatioData("ab","");

	}

}
 