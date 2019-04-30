import java.util.*;

public class Queue <Item> {
	private Node<Item> head;	
	private int size;
	private Node<Item> tail;
	Queue() {
		head = null;
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
	public void enqueue(Item item) {
		if (head == null) {
			Node<Item> newnode = new Node(item);
			head = newnode;
			tail = newnode;
			size++;
		} else {
			Node<Item> newnode = new Node(item);
			head.next = newnode;
			head = newnode;
			// System.out.println("data of head" +head.data);
			size++;
		}
	}
	public Item dequeue() {
		if (head == null) {
			System.out.println("Queue is empty");
			return null;
		}else {
			Item item = tail.data;
			tail = tail.next;
			size--;
			return item;
		}
	}
	public boolean isEmpty() {
		return tail == null;
	}
	public int size() {
		return size;
	}
	public String toString() {
		// System.out.println("hello");
		if (head == null) {
			return "Queue is empty";
		} else {
			Node<Item> temp = tail;
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