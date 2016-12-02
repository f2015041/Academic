import java.util.Scanner;
import java.lang.Math;

public class p14bitsid {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		String year, discipline, type, campus;	// To get random 3 digit number use
		//  import java.util.Random
		 System.out.println("Please Enter Year");	//  Random num=new Random()
		//int num1=num.nextInt(999);
		 year = in.nextLine();

		 System.out.
		    println("Enter A1-chem , A3=EEE , A7=CS ,A4-Mech");
		 discipline = in.nextLine();

		 System.out.println("Enter PS/TS");
		 type = in.nextLine();

		 System.out.
		    print("Enter P:PilANI ,H:Hydabad ,G:Goa , U:Dubai");
		 campus = in.nextLine();

		int n = (int) Math.round(Math.random() * 1000);

		String Rollno =
		    year + discipline + type + campus +
		    Integer.toString(n);

		 System.out.println(Rollno);
		 System.out.println("f" + Rollno +
				    "@dubai.bits-pilani.ac.in");
}}
