import java.util.*;
public class Solution {
	
	

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack();
		stack.push(10);
		stack.push(12);
		stack.push(14);
		System.out.println(stack.toString());
		int x = stack.pop();
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}	
}