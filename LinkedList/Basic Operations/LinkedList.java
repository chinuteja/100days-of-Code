class LinkedList {
	Node head;
	static class Node{
		Node next;
		int data;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public void print() {
		Node n = head;
		while (n != null) {
			System.out.println("data is "+n.data);
			n = n.next;
		}
	}
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		// assigning head to one
		l.head = one;
		// one points to two
		one.next = two;
		// two points to three
		two.next = three;
		// three is the last element
		three.next = null;
		l.print();
	}
}