import java.util.Scanner;
public class fibon {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		 System.out.print("Enter a number for fibonacci series");
		int n = scan.nextInt();
		int f = 0, s = 1;
		int t = f + s;
		 System.out.print(f + " " + s + " ");
		int i;
		while (t <= n) {
			System.out.print(t + " ");
			f = s;
			s = t;
			t = f + s;
}}}
