import java.util.*;
public class Palandrome {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = scan.nextInt();
		LinkedList<Integer> ll = new LinkedList();
		System.out.println("enter elements");
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i<n ; i++) {
			// System.out.println("hello");
			int element = scan.nextInt();
			ll.pushRight(element);
			stack.push(element);
		}
		if(ll.isPalandrome(ll,stack))
			System.out.println("LinkedList is Palandrome");
		else
			System.out.println("Not a Palandrome");
		
	}	
}