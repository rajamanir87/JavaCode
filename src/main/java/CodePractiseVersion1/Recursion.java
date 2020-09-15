package CodePractiseVersion1;

public class Recursion {
	static int count=0;
public static void Recusion() {
	
 
 count++;
 if(count<=5) {
	 System.out.println("Success");
 Recusion();
 }
}
	public static void main(String[] args) {
		Recusion();

	}

}
