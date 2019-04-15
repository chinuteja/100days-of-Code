import java.util.*;

public class Loop {

	private  static Node head;
	private static int size;
	Loop() {
		head = null;
		size = 0;

	}
	private static class Node {
		Node next;
		int data;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public void pushRight(int data) {
		if (head == null) {
			Node newnode = new Node(data);
			head = newnode;
			size++;
		} else {
			Node newnode = new Node(data);
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
			size++;
		}
	}
	public static boolean detectLoop() {
		Node slow_pointer = head;
		Node fast_pointer = head;
		while (slow_pointer != null && fast_pointer != null && fast_pointer.next != null) {
			slow_pointer = slow_pointer.next;
			fast_pointer = fast_pointer.next.next;
			if (slow_pointer == fast_pointer) {
				removeLoop(slow_pointer,fast_pointer);
				return true;
			}

		}
		return false;
	}
	public static void removeLoop(Node loop,Node current) {
		Node ptr1 = null;
		Node ptr2 = null;
		while (true) {
			ptr2 = loop;
			while (ptr2.next != loop && ptr2.next != ptr1) {
				ptr2 = ptr2.next;
			}
			if (ptr2.next == ptr1) {
				break;
			}
			ptr1 = ptr1.next;
		}
		ptr2.next = null;

	}
	public void show() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// int n = Integer.parseInt(scan.nextLine());
		Loop l = new Loop();
		l.pushRight(20);
		l.pushRight(4);
		l.pushRight(15);
		l.pushRight(10);
		l.head.next.next.next.next = l.head;
		if (l.detectLoop()) {
			System.out.println("Loop found");
		} else {
			System.out.println("Loop not found");
		}
		System.out.println("After removing loop");
		l.show();
	}

}