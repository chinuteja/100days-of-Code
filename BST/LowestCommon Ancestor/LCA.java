
import java.util.*;
public class LCA {
	static Node root;
	static Node  findLCA(int n1, int n2) {
		return findLCA(root, n1, n2);
	}
	static Node  findLCA(Node node, int n1, int n2) {
		if (node == null) {
			// System.out.println("node.data");
			return null;
		}
		if (node.data == n1 || node.data == n2) {
			// System.out.println("node.data" + node.data);
			return node;
		}
		Node left_lca = findLCA(node.left, n1, n2);
		Node right_lca = findLCA(node.right, n1, n2);
		if (left_lca != null && right_lca != null) {
			// System.out.println("and condition ");
			return node;
		}
		if (left_lca != null) {
			// System.out.println("left_lca conditon"+left_lca.data);
			return left_lca;
		}
		// System.out.println("aftre "+right_lca.data);
		return right_lca;
	}
}