package HackerankPractise;

public class RepeatedString {

	public static long repeatedString(String s, long n)
	{
		int StrLength=s.length();
		long q=n/StrLength;
		long r=n%StrLength;
		long partiaString=(r==0)?0:r;
		long acount=q*getWorldCount(s,s.length())+getWorldCount(s,partiaString);
		return acount;
		
	}
	public static long getWorldCount(String s, long strLength)
	{
		int count=0;
				for(int i=0;i<strLength;i++){
					if(s.charAt(i)=='a')
					{
						count++;
					}
					
				}
		return count;
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(repeatedString("aba",10));

	}

}
