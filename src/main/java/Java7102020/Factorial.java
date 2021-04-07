package Java7102020;

public class Factorial {

	
	static int factprial(int num ) {
		
		if(num==0) {
			return 1;
		}
		else
		{
			return (num*factprial(num-1));
		}
		
	}
	public static void main(String[] args) {
		
		factprial(5);
		System.out.println(factprial(5));
	}

}
