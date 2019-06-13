import java.util.*;
import java.io.*;
import java.util.LinkedList; 
import java.util.Queue;
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

class LevelOrder {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        // queue.add(null);
        while (!(queue.isEmpty())) {
            // Node current = queue.remove();
            root = queue.poll();
            System.out.print(root.data+" ");
            if (root.left != null) {
                queue.add(root.left);
            }
            if (root.right != null) {
                queue.add(root.right);
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
        levelOrder(root);
    }	
}