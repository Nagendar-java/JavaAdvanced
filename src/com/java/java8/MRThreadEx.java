package src.com.java.java8;

public class MRThreadEx {
	
	public static void ThreadStatus() {
		System.out.println("thread is running");
		
	}

	public static void main(String[] args) {
		
		Thread t2 = new Thread(MRThreadEx::ThreadStatus);
		t2.start();
		
	}
}
