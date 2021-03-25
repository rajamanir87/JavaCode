package CodePractise;

public class GCDGreatestcommonDivisor {
	
	public static int GCD(int a,int b) {
		
		if(a==0) {
			return b;
		}
		if(b==0) {
			return a;
		}
		if(a==b) {
			return a;
		}
		if(a>b) {
			return GCD(a-b,b);
		}
		return GCD(a,b-a);
		
	}

	public static void main(String[] args) {
		System.out.println(GCD(98,56));
	}

}
