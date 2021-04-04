
public class ArmStrongNumber {
	
	public static void armStrongNo(int n)
	{
		int temp=n;
		int sum=0;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;		
			
		}
		if(temp==sum)
		{
			System.out.println("Yes it is ArmStrongNo");
		}
		else
		{
			System.out.println("No it is ArmStrongNo");
		}
				
		
	}

	public static void main(String[] args) {
		armStrongNo(1534);

	}

}
