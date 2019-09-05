import java.util.*;
class MyRunnable implements Runnable {
	public void run() {
		for (int i =0;i<10 ;i++ ) {
			System.out.println("Child Process");
		}
	}
}
public class Solution {
	public static void main(String[] args){
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		// here we are not passing target so default run mehtod is exectued
		// Thread t = new Thread();
		t.start();
		for (int i = 0;i<10 ; i++) {
			System.out.println("Main Thread");
		}
	}	
}