
public class IntegerPalirome {
	
	public static void IntPalirome(int inputNo) {
		
		int lastno = 0,sum = 0,a=0;
		a=inputNo;
		while(a>0) {
			lastno=a%10;
			sum=(sum*10)+lastno;
			a=a/10;
			
		}
		if(sum == inputNo) {
			System.out.println("it is plarome");
			
		}
		else
		{
			System.out.println("it is not plarome");
		}
		
	}

	public static void main(String[] args) {
		IntPalirome(122);

	}

}
