import java.util.*;
public class SortingStack {
	
	public  static Stack<Integer> function(Stack<Integer> input) {
		Stack<Integer> tmpStack = new Stack<Integer>(); 
        while(!input.isEmpty()) 
        { 
            // pop out the first element 
            int tmp = input.pop(); 
          
            // while temporary stack is not empty and 
            // top of stack is greater than temp 
            while(!tmpStack.isEmpty() && tmpStack.peek()  
                                                 < tmp) 
            { 
                // pop from temporary stack and  
                // push it to the input stack 
            input.push(tmpStack.pop()); 
            } 
              
            // push temp in tempory of stack 
            tmpStack.push(tmp); 
        } 
  //       while (!tmpStack.isEmpty()){
		// 	System.out.println(tmpStack.pop());
		// }
        return tmpStack; 
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack  = new Stack();
		int n = scan.nextInt();
		for (int i=0;i<n ;i++ ) {
			stack.push(scan.nextInt());
		}
		Stack<Integer> sortedStack = function(stack);
		System.out.println("sorted elements are ");
		while (!sortedStack.isEmpty()){
			System.out.println(sortedStack.pop());
		}
		
	}	
}