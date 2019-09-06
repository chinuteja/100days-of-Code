import java.util.*;
import java.io.*;

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
class Pair {
    Node node;
    int hd;
    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

class TopView {

    /* you only have to complete the function given below.
    Node is defined as

    class Node {
        int data;
        Node left;
        Node right;
    }

    */

    public static void TopView1(Node node) {
        if (node == null) {
            return;
        }
        ArrayList<Integer> list;
        TreeMap<Integer, ArrayList<Integer>> treemap = new TreeMap();
        int hd = 0;
        Queue<Pair> queue = new LinkedList();
        queue.add(new Pair(node, hd));
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            hd = p.hd;
            node = p.node;
            list = treemap.get(hd);
            if (list == null) {
                list = new ArrayList();
                list.add(node.data);
            } else {
                list.add(node.data);
            }
            treemap.put(hd, list);
            if (node.left != null) {
                queue.add(new Pair(node.left, hd - 1));
            }
            if (node.right != null) {
                queue.add(new Pair(node.right, hd + 1));
            }

        }
        // System.out.println("Array list" +list);
        System.out.println("Map is " + treemap);
        System.out.println("############# TOP VIEW ##############");
        for (Map.Entry<Integer, ArrayList<Integer>> entry : treemap.entrySet()) {
            Integer key = entry.getKey();
            ArrayList<Integer> value = entry.getValue();
            System.out.print(value.get(0)+" ");

            // System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
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
        scan.close();
        TopView1(root);
    }
}