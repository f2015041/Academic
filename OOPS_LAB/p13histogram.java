import java.util.*;
public class p13histogram {
	public static void main(String[]args) {
		double[] m =
		    { 1, 2, 1.5, 2, 3.5, 4, 4, 10, 5, 2, 6, 7, 5, 9, 3.75,
		   4.25 };
		int i, j, k, l;
		for (i = 0; i <= 10; i++) {
			k = 0;
			for (j = 0; j <= 15; j++) {
				if (Math.round(m[j]) == i) {
					k = k + 1;
				}
			}
			System.out.print(i + ": ");
			for (l = 1; l <= k; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
