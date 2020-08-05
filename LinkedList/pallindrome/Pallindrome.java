import java.util.*;
class Node {
	Node next;
	int data;
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
public class Pallindrome {
	static Node head ;
	static int size = 0;
	public static void pushRight(int data) {
		if (head == null) {
			Node newnode = new Node(data);
			size++;
			head = newnode;
		} else {
			Node temp = head;
			Node newnode = new Node(data);
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newnode;
			size++;
		}
		
	}
	public static  Node reverse(Node temp) {
		Node prev = null;
		Node current = temp;
		Node next = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	public static boolean isPallindrome() {
		Node current = head;
		boolean flag;
		int mid;
		if (size %2 != 0) {
			mid = size/2 + 1;
		} else {
			mid = size/2;
		}
		for (int i=0;i<mid ;i++ ) {
			current = current.next;
		}
		Node revHead = reverse(current.next);
		// System.out.println("kjhlkj");
		while(head != null && revHead != null) {
			// System.out.println("reversed data "+revHead.data);
			if (head.data != revHead.data) {
				// System.out.println("head daa" +head.data);
				flag = false;
				return flag;
			}
			head = head.next;
			revHead = revHead.next;
		}
		flag = true;
		return flag;
	}
	public static void display() {
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
			// System.out.println(temp.data);
		}
		System.out.println();
	}

	public static void main(String[] args){
		System.out.println("enter no of elements");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		for (int i=0;i<n ;i++ ) {
			pushRight(scan.nextInt());
		}
		System.out.println("before reversing");
		display();
		boolean flag = isPallindrome();
		if (flag) {
			System.out.println("linked list is pallindrome");
		} else {
			System.out.println("not a pallindrome");
		}
	}	
}