import java.util.Scanner;
public class p12magicsquare {
	public static void Swap(double[][]msquare, int i, int j, int a,
				int b) {
		double temp = msquare[i][j];
		 msquare[i][j] = msquare[a][b];
		 msquare[a][b] = temp;
	} public static void main(String[]args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the sum div. by 2");
		int sum = read.nextInt();
		int i, j;
		double start = (sum / 4) - 7.5 - 1;
		double[][] msquare = new double[4][4];
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				start = start + 1;
				msquare[i][j] = start;
			}
		}
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print(msquare[i][j] + "  ");
			}
			System.out.println();
		}
		Swap(msquare, 0, 0, 3, 3);
		Swap(msquare, 0, 3, 3, 0);
		Swap(msquare, 1, 1, 2, 2);
		Swap(msquare, 1, 2, 2, 1);
		System.out.println();
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print(msquare[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
