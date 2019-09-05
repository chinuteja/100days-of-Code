class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("Child thread");
	}
}

public class Solution {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		// starts another thread  
		t.setPriority(10);//as we are giving priority child thread starts first
		t.start();
		// if we use t.run no seperate thread is created
		// it is similar to calling a method through an objext
		t.run();
		// first main thread is executed
		for (int i = 0; i < 10 ; i++ ) {
			System.out.println("Main Thread");
		}
		// t.start();

	}
}