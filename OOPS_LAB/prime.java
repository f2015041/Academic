import java.util.Scanner;
public class prime {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int flag = 0, i = 0;
		for (i = 2; i <= (x / 2); i++) {
			if (x % i == 0) {
				System.out.
				    println("The number is not prime");
				flag = 1;
				break;
			}
		} if (flag == 0) {
			System.out.println("The number is prime");
		}
	}
}
