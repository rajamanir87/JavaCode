package Java8272020;

public class PrimeNumber {
	public static void prime(int num)
	{
		boolean status=false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%1==0) {
				status=true;
				break;
			}
			
			
		}
		if(!status) {
			System.out.println("it is Prime No");
		}
		else
		{
			System.out.println("it is not Prime No");
		}
		
	}
	public static void main(String[] args) {
		prime(19);
	}
}
