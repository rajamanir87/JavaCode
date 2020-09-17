package CodePractiseVersion1;

public class IntegerPalidrome {

	//reverse the number should same
	public static void integerPalidrome(int n) {
		int temp=n;
		int r,s=0;
		//for(int i=0;i<n;i++)
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		if(temp==s) {
		System.out.println("Yes");	
		}
		else
		{
			System.out.println("No");
		}
	}
	public static void main(String[] args) {
		integerPalidrome(121);
	}

}
