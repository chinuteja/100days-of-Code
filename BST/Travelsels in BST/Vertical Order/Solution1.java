import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node {
    int data;
    Node left;
    Node right;
    public Node(int data) {
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
public class Solution1 {
    Node root;
    public static void main(String[] args) {
        Solution1 tree = new Solution1();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);
        tree.root.right.right.right = new Node(9);
        tree.root.right.right.left = new Node(10);
        tree.root.right.right.left.right = new Node(11);
        tree.root.right.right.left.right.right = new Node(12);
        System.out.println("Vertical Order traversal is");
        printLevelVerticalOrder(tree.root);

    }
    private static void printLevelVerticalOrder(Node node) {
        if (node == null)
            return;
        int hd = 0;
        //Pair p=new Pair();
        ArrayList<Integer> list;
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(node, hd));
        while (!q.isEmpty()) {
            Pair p = q.poll();
            hd = p.hd;
            node = p.node;
            list = map.get(hd);
            if (list == null) {
                list = new ArrayList<>();
                list.add(node.data);
            } else {
                list.add(node.data);
            }
            map.put(hd, list);
            if (node.left != null) {
                q.add(new Pair(node.left, hd - 1));
            }
            if (node.right != null) {
                q.add(new Pair(node.right, hd + 1));
            }
        }
        System.out.println("Map  "+map);
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " ");
        }
    }
}
