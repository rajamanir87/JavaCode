package Java142021;

public class StringHasDigitorNot {
	
	public static boolean isDigit(String str) {
		
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				return true;
				
			}
			else {
				return false;
				
			}
			
		}
		return false;
		
	}

	public static void main(String[] args) {
		boolean data=isDigit("rajamani1234");
		System.out.println(data);
		
		

	}

}
