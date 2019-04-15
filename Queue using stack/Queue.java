import java.util.*;
public class Queue {
	Stack<Integer> s1 = new Stack();
	Stack<Integer> s2 = new Stack();
	public void enqueue(int data) {
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(data);
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	public int dequeue() {
		if (s1.isEmpty()) {
			System.out.println("queue is empty");
			return -1;

		}
		int x = s1.pop();
		return x;
	}
}