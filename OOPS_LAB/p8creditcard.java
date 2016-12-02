class Creditcard {
	String name, cardno, expiryMonth;
	boolean enabled;
	int pin, cardType, currentCredit, creditLimit;
	public Creditcard() {
		name = "Max";
		cardno = "123tyu";
		expiryMonth = "1/2/17";
		enabled = true;
		pin = 19756;
		cardType = 2;
		//Platinum ,gold or Silver
		currentCredit = 25000;
		creditLimit = 1000;
	} public void changePin(int newPin) {
		pin = newPin;
	}
	public void transact(int amt) {
		if (amt > 0) {
			currentCredit += amt;
		} else {
			currentCredit = -amt;
		}
	}
	public void changeCardStatus(boolean status) {
		enabled = status;
	}
	void display() {
		System.out.
		    println
		    ("Name Cardno  Expiry  Enabled Pin  Type currentCREDIT CREDITlimit");
		System.out.println(name + " " + cardno + " " +
				   expiryMonth + " " + enabled + "  " +
				   pin + " " + cardType + " " +
				   currentCredit + "  " + creditLimit);
	}
}

public class p8creditcard {
	public static void main(String args[]) {
		Creditcard c = new Creditcard();
		 c.changePin(2000);
		 c.transact(1500);
		 c.changeCardStatus(false);
		 c.display();
}}
