import java.util.*;

public class Solution{
	Solution(){

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = scan.nextInt();
		int a[] = new int[n];
		for (int j = 0; j < n; j++) {
			a[j] = scan.nextInt();
		}
		for(int i = 0; i < n; i++) {
			int max = a[i];
			int max1 = max;
			for (int k = i; k < n-1; k++) {
				if (a[k+1] > max ) {
					max = a[i+1];
				}
			}
			if (max == max1) {
				System.out.print("The leaders are : " + max + " ");
			}
		}
	}
}