import java.util.*;
public class Bst <Key extends Comparable <Key>> {
	Node root;
	class Node {
		Node right,left;
		Key key;
		Node(Key key) {
			this.key = key;
		}
	}
	public void insert(Key key) {
		root= insert(root,key);
	}
	public Node insert(Node x, Key key) {
		if (x == null) { 
			x = new Node(key); 
			return x; 
		}
		int cmp = key.compareTo(x.key);
		if (cmp < 0) {
			x.left = insert(x.left,key);
		} if (cmp > 0) {
			x.right = insert(x.right,key);
		} return x;
	}
	public boolean search(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to contains() is null");
        return get(key) != null;
    }
    public Key get(Key key) {
        return get(root, key);
    }

    private Key get(Node x, Key key) {
        if (key == null) throw new IllegalArgumentException("calls get() with a null key");
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if      (cmp < 0) return get(x.left, key);
        else if (cmp > 0) return get(x.right, key);
        else              return x.key;
    }
	public static void main(String[] args) {
		Bst tree = new Bst();
		tree.insert(10);
		tree.insert(20);
		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
		System.out.println(tree.search(20));
	}
}