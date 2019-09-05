import java.util.*;
class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}
public class Spiral {

	public static void spiralView(Node root) {
		if (root == null)
			return;
		Stack<Node> stack1 = new Stack();
		Stack<Node> stack2 = new Stack();
		stack1.add(root);
		while (!stack1.isEmpty() || !stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				 root = stack1.pop();
				System.out.print(root.data + " ");
				if (root.left != null)
					stack2.add(root.left);
				if (root.right != null)
					stack2.add(root.right);
			}
			while (!stack2.isEmpty()) {
				 root = stack2.pop();
				 System.out.print(root.data + " ");
				if (root.right != null)
					stack1.add(root.right);
				if (root.left != null)
					stack1.add(root.left);
			}
		}
	}

	public static void levelOrder(Node root) {
		if (root == null)
			return ;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			root = queue.poll();
			System.out.print(root.data + " ");
			if (root.left != null)
				queue.add(root.left);
			if (root.right != null)
				queue.add(root.right);
		}
	}
	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				root.left = insert(root.left, data);

			} else {
				root.right = insert(root.right, data);

			}
			return root;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		// levelOrder(root);
		spiralView(root);
	}
}