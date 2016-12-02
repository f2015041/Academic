import java.util.Scanner;
public class p11sieveoferat {
	public static void main(String[]args) {
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();	//User input
		 boolean[] a = new boolean[n + 1];
		int i, j;
		for (i = 0; i < n + 1; i++) {
			a[i] = true;
		} a[0] = false;
		a[1] = false;
		for (i = 1; i <= (n + 1) / 2; i = i + 2) {
			if (i == 1) {
				i++;
				for (j = i + i; j <= n; j = j + i) {
					a[j] = false;
				}
				i--;
			} else if (a[i] == true) {
				for (j = i + i; j <= n; j = j + i) {
					a[j] = false;
				}
			}
		}

		for (i = 0; i < n + 1; i++) {
			if (a[i] == true) {
				System.out.println(i);
			}
		}
	}
}
