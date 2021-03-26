package Java8272020;

public class Fibonacci {

	public static void main(String[] args) {
		int n=10;
		int t1=0;
		int t2=1;
		for(int i=0;i<=n;i++) {
			System.out.println(t1+" , ");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
			
			
		}

	}

}
