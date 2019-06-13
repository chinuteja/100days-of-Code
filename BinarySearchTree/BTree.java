import java.util.*;
public class BTree {
	private Node root;
	private class Node {
		private int key;
		private Node left,right;
		private int size;
		public Node(int key,int size) {
			this.key = key;
			this.size = size;
		}
	}
	public void put(int key) {
		if (key == null)
			System.out.println("cannot put null key");
		root = put(root,key);
	}
	private Node put(Node root,int key) {
		if (root == null)
			return new Node(key,1);
		if (key < root.key) {
			root.left = put(root.left,key);	
		} else if (key > root.key) {
			root.right  = put(root.right,key);
		}
		return root;

	}
}