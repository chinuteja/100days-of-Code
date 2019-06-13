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
public class PreOrder {
	static ArrayList<Integer> list = new ArrayList<>();
	public static ArrayList preOrderTraversal(Node root){
		if (root == null) {
			return null;
		}
		list.add(root.data);
		// System.out.print(root.data+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
		// System.out.println(list);
		return list;

	}
	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            // Node cur;
            if(data <= root.data) {
                root.left = insert(root.left, data);
                // root.left = cur;
            } else {
                root.right = insert(root.right, data);
                // root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        System.out.println(preOrderTraversal(root));
        
    }
}