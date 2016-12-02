import java.util.Scanner;
public class p6evenodd {
	public static void main(String[]args) {
		Scanner read = new Scanner(System.in);
		int[] a = new int[10];
		int i;
		for (i = 0; i <= 9; i++) {
			a[i] = read.nextInt();
		} for (i = 0; i <= 9; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		}
	}
}
