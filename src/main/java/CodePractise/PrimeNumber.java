package CodePractise;

public class PrimeNumber {

	public static void main(String[] args) {
		int no=29;
		boolean status=false;
		for(int i=2;i<=no/2;i++) {
			if(no%i==0) {
				status=true;
				break;
				
			}
			
		}
		if(!status) {
			System.out.println("it is Prime no");
		}
		else
		{
			System.out.println("it is not Prime no");
		}
		

	}

}
