package CodePractise;

public class SqureRootofNumber {
public static int SqureRoot(int x) {
	if(x==0 || x==1)
	{
		return x;
	}
	int i=1;
	int result=1;
	
	while(result<=x)
	{
		i++;
		result=i*i;
	}
	return i-1;
	
}
	public static void main(String[] args) {
		
		SqureRoot(16);
		System.out.println(SqureRoot(16));
	}

}
