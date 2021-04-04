package DeadLock;

public class Thread2 extends Thread {
	private shared s1;
	private shared s2;
	
	public Thread2(shared s1,shared s2) {
		this.s1=s1;
		this.s2=s2;
		
	}
	@Override
	public void run() {
		s1.test1(s2);
	}
	
}