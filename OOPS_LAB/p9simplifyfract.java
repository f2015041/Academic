import java.util.Scanner;
public class p9simplifyfract {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		int b = read.nextInt();
		int c = read.nextInt();
		int d = read.nextInt();
		 System.out.println("Input:" + a + "/" + b + "+" + c +
				    "/" + d);
		int num = (a * d) + (c * b);
		int denom = b * d;
		int i;
		int ss;
		if (num > denom) {
			ss = denom;
		} else {
			ss = num;
		}
		for (i = ss; i >= 1; i--) {
			if (num % i == 0 && denom % i == 0) {
				num = num / i;
				denom = denom / i;
				break;
			}
		}
		System.out.println("ans=" + num + "/" + denom);
	}
}
