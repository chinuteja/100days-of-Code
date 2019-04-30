import java.util.*;
public class Spiral {
	public static void sipral(int[][] matrix, int size) {
		int i = 0;
		int j = 0;
		while (j < size - 1) {
			System.out.print(matrix[i][j] + " ");
			j++;
		}
		i = 1;
		while (i < size - 1) {
			System.out.print(matrix[i][j] + " ");
			i++;
		}
		while (j > 0) {
			System.out.print(matrix[i][j] + " ");
			j--;
		}
		// System.out.println("value of i " +i);
		// System.out.println("value of j " +j);
		while (i > 0) {
			System.out.print(matrix[i][j] + " ");
			i--;
		}
		// System.out.println("value of i" +i);
		i = 1;
		j = 1;
		while (j < size - 1) {
			System.out.print(matrix[i][j] + " ");
			j++;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of matrix");
		int n = scan.nextInt();
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		sipral(matrix, n);
	}
}