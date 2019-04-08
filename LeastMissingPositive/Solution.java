import java.util.*;

public class Solution {
	public static int LeastMissing(int[] arr, int n) {
		for (int i = 0; i < n-1 ; i++) {
			if (arr[i] <= 0) {
				continue;
			} if ((arr[i] - arr[i+1]) != 1) {
				return arr[i]+1;
			}
		}
		return 0;
	}



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n = Integer.parseInt(scan.nextLine());
		int[] arr = new int[n];
		for (int i = 0; i < n ; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(LeastMissing(arr, n));
		


	}
}