import java.util.*;

public class Solution {
	
	

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of enqueue() operations");
		int n = scan.nextInt();
		Queue queue = new Queue();
		System.out.println("enter elements");
		for (int i = 0; i < n ; i++ ) {
			queue.enqueue(scan.nextInt());
		}
		System.out.println("eneter no of dequeue operations");
		int n1 = scan.nextInt();
		System.out.println("elements dequed");
		for (int i = 0; i<n1 ; i++) {
			System.out.println(queue.dequeue());
		}
		
	}	
}