import java.util.*;

public class Solution {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		System.out.println("enter nodes");
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = Tree.insert(root, data);
		}
		System.out.println("enter two nodes to find common anccestor");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		Node ans = LCA.findLCA(n1,n2);
		System.out.println(ans.data);
		// Tree.displayTree(root);

	}
}