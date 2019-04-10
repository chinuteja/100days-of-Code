import java.util.*;
public class Solution {
	public static void function(int[] arr, int n) {
		ArrayList<Integer> arrlist = new ArrayList<>();
		int i = 0;
		while (i < n){
			arr[i] = arr[i] * 12;
			i = i + 2;
			// System.out.println("value of i "+i);
			// j = i;
			arrlist.add(arr[i - 1] + arr[i - 2] );

		}
		System.out.println(Collections.max(arrlist));

	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of testcases");
		int n = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < n ; i++) {
			System.out.println("enter no of pairs");
			int m = Integer.parseInt(scan.nextLine());
			
				System.out.println("enter pairs");
				String line = scan.nextLine();
				String[] tokens = line.split(" ");
				int[] arr = new int[tokens.length];
				for (int x = 0; x < tokens.length ; x++) {
					arr[x] = Integer.parseInt(tokens[x]);
				}
				function(arr, tokens.length);
			}
		}

	}
