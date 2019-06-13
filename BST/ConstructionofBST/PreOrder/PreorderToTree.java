class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}
}
public class PreorderToTree {
	public int pIndex = 0;

	public Node constructTree(int[] preOrder, int data, int min, int max) {
		if (pIndex < preOrder.length) {
			Node root = new Node(data);
			pIndex++;
			if (pIndex < preOrder.length) {
				// creating left subtree
				root.left = constructTree(preOrder, preOrder[pIndex], min, data);
				// creating right subtree
				root.right = constructTree(preOrder,preOrder[pIndex],data,max);
			}
			return root;
		}
		return null;
	}

	public void displayTree(Node root) {
		if (root != null) {
			displayTree(root.left);
			System.out.print(" " + root.data);
			displayTree(root.right);
		}
	}

	public static void main(String args[]) {
		PreorderToTree p = new PreorderToTree();
		int[] preOrder = { 20, 10, 5, 1, 7, 15, 30, 25, 35, 32, 40 };
		Node root = p.constructTree(preOrder, preOrder[0], Integer.MIN_VALUE,
		                            Integer.MAX_VALUE);
		System.out.println("Inorder Traversal of Constructed Tree : ");
		p.displayTree(root);
	}
}

