
public class firstNonRepeatedStringinJava {

	
	public static  char nonRepeatedString(String data) {
		
		int str=data.length();
		for(int i=0;i<str;i++) {
			boolean unique=true;
			for(int j=0;j<str;j++) {
				if(i!=j && data.charAt(i) == data.charAt(j) )
				{
					unique=false;
					break;
				}
			}
			if(unique) {
				return data.charAt(i);
				
			}
			
		}
		return '0';
		
	}
	public static void main(String[] args) {
		//nonRepeatedString("rajamani");
		System.out.println(nonRepeatedString("rrajamani"));
	}

}
