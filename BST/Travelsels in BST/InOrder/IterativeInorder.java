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

class IterativeInorder {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void InorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack();
        Node temp = root;
        while (!(stack.isEmpty()) || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }else {
                temp = stack.pop();
                list.add(temp.data);
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
        System.out.println(list);
      
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
        InorderTraversal(root);
    }	
}