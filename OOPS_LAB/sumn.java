import java.util.Scanner;
public class sumn {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		int sum = 0, i = 0;
		for (i = 0; i <= n; i++) {
			sum = sum + i;
		} System.out.println("The sum is " + sum);
	}
}
