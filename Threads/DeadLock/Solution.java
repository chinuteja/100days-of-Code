class A {
	synchronized void d1(B b) {
		System.out.println("Thread1 starts executions of d1()");
		try{
			Thread.sleep(5000);
		}catch (InterruptedException e) {
			
		}
		System.out.println("Thread1 trying to call b's last mehtod");
		b.last();
		
	}
	synchronized void  last() {
		System.out.println("Inside A last");
		
	}
}
class B {
	synchronized void d2(A a) {
		System.out.println("Thread2 starts excution of d2()");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("THread2 calls a's last method");
		a.last();
		
	}
	synchronized void last() {
		System.out.println("Inside Blast");
	}
}
public class Solution extends Thread{
	A a = new A();
	B b = new B();
	public void m1() {
		this.start();
		// main thread
		a.d1(b);
	}
	   
	public static void main(String[] args) {
		Solution t = new Solution();
		t.m1();

	}
}