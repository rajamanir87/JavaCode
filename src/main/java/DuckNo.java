
public class DuckNo {
	public static boolean duckNo(String str) {
		int i=0;
		int num=str.length();
		while(i<num && str.charAt(i) =='0') {
			i++;
		}
		while(i<num) {
			if(str.charAt(i) =='0') { 
				return true;
				
			}
			i++;
		}
		return false;
		
	}

	public static void main(String[] args) {
		System.out.println(duckNo("0123"));

	}

}
