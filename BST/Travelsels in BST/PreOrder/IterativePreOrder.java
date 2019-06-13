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
public class IterativePreOrder {
	// static ArrayList<Integer> list = new ArrayList<>();
	public static void preOrderTraversal(Node root){
		if (root == null) {
			return ;
		}
		Stack<Node> stack = new Stack();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.print(temp.data+" ");
            if (temp.right != null) {
                stack.push(temp);
            } if (temp.left != null) {
                stack.push(temp);
            }
        }

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
        preOrderTraversal(root);
        
    }	
	
}