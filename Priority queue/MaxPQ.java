import java.util.*;
public class MaxPQ {
	int[] pq;
	int size;
	MaxPQ(int capacity) {
		pq = new int[capacity + 1];
		size = 0;
	}
	public   void insert(int key) {
		pq[++size] = key;
		swim(size);
	}
	private  void swim(int k) {
		while (k >1 && less(k/2,k)) {
			swap(k,k/2);
			k = k / 2;
		}
	}
	private  boolean less(int i,int j) {
		return pq[i] <pq[j] ;
	}
	private  void swap(int i, int j) {
		int temp = pq[i];
		pq[i] = pq[j];
		pq[j] = temp;
	}
	public  int delMax() {
		int max = pq[1];
		swap(1,size--);
		sink(1);
		pq[size+1] = 0;
		return max;
	}
	private  void sink(int k) {
		while (2*k <= size) {
			int j = 2*k;
			while (j<size && less(j,j+1)) {
				j++;
			}
			if (!less(k,j)) {
				break;
			}
			swap(k,j);
			k = j;
		}
	}
	public  void toString1() {
		String str = "";
		int i = 1;
		while (i<size) {
			System.out.println(pq[i] + " ");
			i++;
		}
	}
	public static void main(String[] args) {
		MaxPQ maxpq = new MaxPQ(5);
		maxpq.insert(10);
		maxpq.insert(20);
		maxpq.insert(30);
		maxpq.insert(40);
		maxpq.insert(50);
		maxpq.toString1();
		maxpq.delMax();
		System.out.println("after deleting");
		maxpq.toString1();

	}
}