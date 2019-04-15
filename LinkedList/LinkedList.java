import java.util.*;
class LinkedList<Integer> {
	private Node head;
	private int size;
	LinkedList() {
		head = null;
		size = 0;
	}
	static class Node {
		Node next;
		int data;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public int size() {
		return size;
	}
	public void pushRight(int data) {
		if (head == null) {
			// System.out.println("ifblol");
			Node newnode = new Node(data);
			head = newnode;
			size++;
		} else {
			// System.out.println("else");
			Node newnode = new Node(data);
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
			size++;
		}
	}
	public void popLeft() {
		Node temp = head;
		if (head == null) {
			System.out.println("Linked list is empty");
		} else {
			System.out.println(head.data);
			// temp.next = null;
			head = head.next;
			size--;
		}
	}
	public boolean isPalandrome(LinkedList ll,Stack stack) {
		
		int count = 0;
		Node temp1 = head;
		while (temp1 != null) {
			int poped = (int)stack.pop();
			// System.out.println("poped itme " +poped);
			// System.out.println("data  " +temp1.data);
			// System.out.println("hello");
			if (temp1.data == poped) {
				count++;
				// System.out.println("count is " +count);
			}
			temp1 = temp1.next;
			
		}
		if (count == ll.size()) {
			return true;
		}
		return false;
		

	}

}