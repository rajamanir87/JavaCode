package DeadLock;

public class shared {
	
	public synchronized void test1(shared s2) {
		System.out.println("Test1 begin");
		Utils.sleep(1000);
		s2.test2();
			System.out.println("Test1 end");
		
	}
	public synchronized void test2() {
		System.out.println("Test2 begin");
		Utils.sleep(1000);
		
			System.out.println("Test2 end");		
}
}
