package CodePractiseVersion1;

public class ArmstrongNumber {

	
	//login n=153=1*1*1 + 5*5*5 +3*3*3=153 this is ArmStrong Number
	
	public static void armstrongNumber(int n) {
		int temp=n;
		int r,sum=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		if(temp==sum) {
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	public static void main(String[] args) {
		
		armstrongNumber(370);
		
	}

}
