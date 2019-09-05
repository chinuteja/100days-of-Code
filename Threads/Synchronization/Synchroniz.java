import java.util.*;
class Display {
	public synchronized void wish(String name) {
		for (int i=0;i<10 ;i++ ) {
			System.out.print("Good morning");
			try{
				Thread.sleep(2000);
			} catch(Exception e){
				System.out.println(e);
			} System.out.print(":"+name);
			System.out.println();
		}
	}
}
class MyThread extends Thread {
	Display d;
	String name;
	MyThread(Display d,String name) {
		this.d = d;
		this.name = name;
	}
	public void run(){
		d.wish(name);
	}
}
public class Synchroniz {
	public static void main(String[] args){
		Display d = new Display();
		// Display d2 = new Display();
		MyThread t = new MyThread(d,"teja");
		MyThread t1 = new MyThread(d,"chinu");
		// MyThread t1 = new MyThread(d2,"chinu");
		t.start();
		t1.start();

		
	}	
}