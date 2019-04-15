import java.util.*;
class LinkedList {
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
	public void pushLeft(int data) {
		if (head == null) {
			Node newnode = new Node(data);
			head = newnode;
			size++;
		} else {
			Node newnode = new Node(data);
			newnode.next = head;
			head = newnode;
			size++;
		}
	}
	public int popLeft() {
		Node temp = head;
		if (head == null) {
			System.out.println("Linked list is empty");
			return -1;
		} else {
			int x = head.data;
			// temp.next = null;
			head = head.next;
			size--;
			return x;
		}
	}
	public boolean search(int data) {
		Node current = head;
		while (current != null) {
			if (current.data == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	public int popRight() {
		Node temp = head;
		if (temp == null) {
			System.out.println("Linked list is empty");
			return -1;
		} else if (size < 2) {
			// System.out.println("size elif" +size);
			int x = head.data;
			head = null;
			size--;
			return x;

		} else {

			while (temp.next.next != null) {
				temp = temp.next;
			}
			// System.out.println("hell");
			int x = temp.next.data;
			// System.out.println(temp.next.data);
			temp.next = null;
			size--;
			// System.out.println("size......"+size);
			// System.out.println(temp.data);
			return x;
		}
		// return temp.data;
	}
	public void size() {
		System.out.println("size of linked list is ....." + size);
	}
	public void add(int position, int data) {
		if (head == null) {
			System.out.println("Linked list is empty we cannot insert a node at given position");
		} else if (position > size) {
			System.out.println("Inserting at that position is not possible");
		} else {
			Node newnode = new Node(data);
			Node previous = head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			Node current = previous.next;
			newnode.next = current;
			previous.next = newnode;
			size++;
		}
	}
	public void delete(int position) {
		if (head == null) {
			System.out.println("Linked list is empty we cannot insert a node at given position");
		} else if (position > size) {
			System.out.println("Inserting at that position is not possible");
		} else if (position == 1) {
			popLeft();
			return;
		} else if (position == size) {
			popRight();
			return;
		} else {
			Node previous = head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count ++;
			}
			Node current = previous.next;
			previous.next = current.next;
			current.next = null;
			size--;
		}

	}
	public void deleteItem(int item) {
		// System.out.println("ehllo");
		Node temp = head;
		Node previous = null;
		if (head == null) {
			System.out.println("Linked list is empty");
		}
		// if (temp != null && temp.data == item) {

		// 	head = temp.next;
		// 	temp = null;
		// 	size--;
		// }
		if (search(item) == true) {
			if (temp != null && temp.data == item) {
				head = temp.next;
				return;
			}
			while (temp != null && temp.data != item) {
				previous = temp;
				temp = temp.next;
			}

			// If key was not present in linked list
			if (temp == null) return;

			// Unlink the node from linked list
			previous.next = temp.next;
		} else {
			System.out.println("element not found");
		}

		// while (previous.next != null) {
		// 	// System.out.println("hello");
		// 	if (previous.data == item) {
		// 		// System.out.println("previous data" +previous.data);

		// 		size--;
		// 		return ;
		// 	}
		// 	previous = previous.next;
		// }
		// System.out.println("item not found");
	}
	public void deleteEndPosition(int position) {
		int newposition = size - (position - 1) ;
		int count = 1;
		Node previous = head;
		if (position == 1) {
			popRight();
			return;
		} else if (position == size) {
			popLeft();
			return;
		} else {
			while (count < newposition - 1) {
				previous = previous.next;
				count++;
			}
			Node current = previous.next;
			previous.next = current.next;
			current.next = null;
			size--;
		}
	}
	public void print() {
		String str = "(";
		Node temp = head;
		if (temp == null) {
			System.out.println("empty LinkedList");
			return ;
		} else {
			while (temp.next != null) {
				str += temp.data + ", ";
				temp = temp.next;
			}
		}
		str += temp.data;
		// System.out.println(str);
		str = str + ")";
		System.out.println(str);
	}
}
class Operation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList l = new LinkedList();
		while (scan.hasNext()) {
			String[] input = scan.nextLine().split(" ");
			switch (input[0]) {
			case "pushRight":
				l.pushRight(Integer.parseInt(input[1]));
				// System.out.println(l);
				break;
			case "print":
				l.print();
				break;

			case "pushLeft":
				l.pushLeft(Integer.parseInt(input[1]));
				break;
			case "popRight":

				System.out.println(l.popRight());
				break;
			case "size":
				l.size();
				break;
			case "popLeft":
				System.out.println(l.popLeft());;
				break;
			case "add":
				l.add(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
				break;
			case "delete":
				l.delete(Integer.parseInt(input[1]));
				break;
			case "deleteItem":
				l.deleteItem(Integer.parseInt(input[1]));
				break;
			case "search":
				System.out.println(l.search(Integer.parseInt(input[1])));

				break;
			case "deleteEndPosition":

				l.deleteEndPosition(Integer.parseInt(input[1]));
				break;
			}

		}

	}
}