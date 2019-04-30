import java.util.*;
public class Solution {
	
	

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Queue<Integer> queue = new Queue();
		for (int i = 0; i<5 ;i++ ) {
			queue.enqueue(scan.nextInt());
		}
		System.out.println(queue.toString());
		System.out.println(queue.dequeue());
		System.out.println(queue.toString());
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		// queue.enqueue(10);
		// // System.out.println(queue.toString());
		// queue.enqueue(12);
		// queue.enqueue(14);
		// System.out.println(queue.toString());
		// int x = queue.dequeue();
		// System.out.println(queue);
		// System.out.println(queue.dequeue());
		// System.out.println(queue.dequeue());
		// System.out.println(queue.dequeue());
		
	}	
}