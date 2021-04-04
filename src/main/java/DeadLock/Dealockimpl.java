package DeadLock;

public class Dealockimpl {

	public static void main(String[] args) {
		shared s1=new shared();
		shared s2=new shared();
		Thread1 t1=new Thread1(s1,s2);
		t1.start();
		
		Thread1 t2=new Thread1(s1,s2);
		t2.start();
		Utils.sleep(2000);
		
	}

}
