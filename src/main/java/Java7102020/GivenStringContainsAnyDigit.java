package Java7102020;

public class GivenStringContainsAnyDigit  {
	static void containsAnyDigit(String str) throws NullPointerException {
		if(str==null) {
			System.out.println("It is not valid string");
		}
		if(str.matches("[0-9]+")) {
			System.out.println("only Contains digit");
		}
		if(str.matches("[a-zA-Z]+")) {
			System.out.println("only Contains String");
		}
		else
			System.out.println("Contains digit and String");
	}
	public static void main(String[] args) {
		containsAnyDigit("123");
		containsAnyDigit(null);
		containsAnyDigit("123java");
		containsAnyDigit("java");
		
	}

}
