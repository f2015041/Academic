class Account {
	String name;
	int act;
	int balance;
	public Account(String n, int a, int b) {
		name = n;
		act = a;
		balance = b;
	} public void withdraw(int amt) {
		if (amt <= balance) {
			System.out.println("Withdrawal successful");
			balance = balance - amt;
		} else {
			System.out.
			    println
			    ("You do not have enough balance in your account");
		}
	}
	public void deposit(int amt) {
		balance = balance + amt;
		System.out.println("Deposit successful");
	}
	void display() {
		System.out.println("BALANCE=" + balance + " Account " +
				   act + " Name : " + name);
	}
}

public class p5account {
	public static void main(String[]args) {
		Account a = new Account("Max", 3754, 7000);
		 a.withdraw(5000);
		 a.display();
		 a.deposit(5000);
		 a.display();
}}
