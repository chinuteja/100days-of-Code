import java.util.*;

public class Solution {

	public static void Position(int[] arr, int n) {
		int positive = 1;
		int negative = 0;
		while (true) {
			while(positive < n && arr[positive] > 0)
				positive += 2;
			while(negative < n && arr[negative] < 0)
				negative += 2;
			if (negative < n && positive < n) {
				int temp = arr[negative];
				arr[negative] = arr[positive];
				arr[positive] = temp;
			} else {
				break;
			}

			
		}
		
	}
	public static void show(int[] arr) {
		for (int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);

		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n = Integer.parseInt(scan.nextLine());
		int[] arr = new int[n];
		System.out.println("Enter elements of an array");
		for (int i = 0; i < n ; i++) {
			arr[i] = scan.nextInt();
		}
		Position(arr, n);
		System.out.println("After swapping");
		show(arr);
	}
}