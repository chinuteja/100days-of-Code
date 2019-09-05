class ThreadB extends Thread {
	int total = 0;
	public void run() {
		synchronized (this) {
			System.out.println("Child thread starts calculation");

			for (int i = 0; i <= 100 ; i++ ) {
				total = total + i;
			}
			System.out.println("child thread gives notification");
			this.notify();
			// System.out.println("hello");
			// 1crore of code
		}
	}
}
public class Solution {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		// Thread.sleep(10000);
		// b.join();
		synchronized (b) {
			System.out.println("Main thread trying to call wait method");
			b.wait();
			//  b.wait(10000);
		}
		System.out.println(b.total);

	}
}