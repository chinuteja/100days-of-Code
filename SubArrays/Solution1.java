import java.util.*;

public class Solution1{
	Solution1(){

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = scan.nextInt();
		int arr[] = new int[n];
		int count = 0;
		for (int j = 0; j < n; j++) {
			System.out.println("Enter element");
			arr[j] = scan.nextInt();
		}
		System.out.println("Enter sum value : ");
		int sum = scan.nextInt();
		for(int i = 0; i < n; i++) {
			if (arr[i] > sum) {
				break;
			} else {
			for (int k = i; k < n-2; k++) {
				int a = arr[k];
				int b = arr[k + 1];
				int c = arr[k + 2];
				if (a == sum) {
					System.out.println(a);
					System.out.println("true");
					count++;
				}
				if ((a + b) == sum) {
					System.out.println(a + " " + b);
					System.out.println("true");
					count++;
				}
				if ((a+b+c == sum)) {
					System.out.println(a + " " + b + " " + c);
					System.out.println("true");
					count++;
				}
			}
			if (count == 0){
				System.out.println("false");
			}
		}		
			}
			
	}
}
