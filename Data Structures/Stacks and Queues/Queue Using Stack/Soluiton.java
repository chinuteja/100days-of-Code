import java.util.*;
public class Soluiton {
	
	public static void function(Stack stack){
		Stack<Integer> dummystack = new Stack();
		while(!stack.isEmpty()) {
			// System.out.println("poped "+stack.pop());
			int num  = (int)stack.pop();
			// System.out.println("elemeent "+num);
			dummystack.push(num);
			// System.out.println("pushed "+dummystack.peek());
		}
		// System.out.println("#########");
		while (!dummystack.isEmpty()) {
			System.out.println(dummystack.pop());
		}
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack  = new Stack();
		int n = scan.nextInt();
		for (int i=0;i<n ;i++ ) {
			stack.push(scan.nextInt());
		}
		function(stack);
	}	
}