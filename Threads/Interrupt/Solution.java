class MyThread extends Thread {
	static Thread mt;
	public void run() {
		try {
			for (int i=0;i<10 ; i++) {
				System.out.println("Lazy thread");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println("Got Intrupted");
		}
	}
}

	public class Solution{
		public static void main(String[] args)throws InterruptedException {
			// MyThread.mt = Thread.currentThread();
			MyThread t = new MyThread();
			t.start();
			t.interrupt();
			System.out.println("end of main");
		}
	}