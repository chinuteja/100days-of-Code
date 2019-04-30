import java.util.*;
public  class Stack<Item> {
	private Node<Item> head;
	// private Node<Item> tail;
	private int size;
	Stack() {
		head = null;
		// tail = null;
		size = 0;
	}
	static class Node<Item> {
		private Node<Item> next;
		private Item data;
		Node(Item data) {
			this.data = data;
			this.next = null;
		}
	}
	public  void push(Item data) {
		if (head == null) {
			Node<Item> newnode = new Node(data);
			head = newnode;
			// tail= newnode; 
		} else {
			// Node<Item> temp = head;
			Node<Item> newnode = new Node(data);
			newnode.next = head;
			head = newnode;
			size++;
		}
	}
	public Item pop() {
		if (head == null) {
			System.out.println("Stack is empty");
			return null;
		} else {
			Item item = head.data;
			head = head.next;
			size--;
			return item;
		}
	}
	public boolean isEmpty() {
		return head == null;
	}
	public int size() {
		return size;
	}
	public String toString() {
		Node<Item> temp = head;
		if (head == null) {
			return "Stack is empty";
		} else {
			String str = "";
			while (temp.next != null) {
				str += temp.data + " ";
				temp = temp.next;
			}
			str += temp.data;
			return str;
		}
	}
}