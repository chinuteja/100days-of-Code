import java.util.*;
class QueueUsingStack {
	Stack<Integer> stack1 = new Stack();
	Stack<Integer> stack2 = new Stack();
	public void put(int[] arr) {
		for (int i = 0 ; i<arr.length ; i++) {
			stack1.push(arr[i]);
		}
		while (stack1.size() >= 0) {
			stack2.push(stack1.pop());
		}
	}
	public int remove() {

		return stack2.pop();
	}

}
public class Solution {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no of elements");
		int n = scan.nextInt();
		QueueUsingStack qus = new QueueUsingStack();
		int[] arr = new int[n];
		System.out.println("enter elements");
		for (int i = 0; i<n ;i++ ) {
			arr[i] = scan.nextInt();
		}
		qus.put(arr);
		System.out.println("enter no of elements to b removed");
		int removed = scan.nextInt();
		for (int i = 0; i<removed ; i++) {
			System.out.println(qus.remove());
			
		}
		
		
	}	
}