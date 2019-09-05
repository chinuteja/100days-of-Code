import java.util.*;
class Node {
	Node left;
	Node right;
	int data;
	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class Tree {
	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			if (data <= root.data) {
				root.left = insert(root.left, data);
			} else {
				root.right = insert(root.right, data);
			}
		}
		return root;
	}
	public static  void displayTree(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		// queue.add(null);
		while (!(queue.isEmpty())) {
			// Node current = queue.remove();
			root = queue.poll();
			System.out.print(root.data + " ");
			if (root.left != null) {
				queue.add(root.left);
			}
			if (root.right != null) {
				queue.add(root.right);
			}

		}
	}
}