class Student {
	String name;
	int age;
	float t1, t2, compre, total;
	char grade;

	public Student(String n, int a) {
		name = n;
		age = a;
	} public void setT1(float at1) {
		t1 = at1;
	}
	public void setT2(float at2) {
		t2 = at2;
	}
	public void setCompre(float aComp) {
		compre = aComp;
	}
	public void calcTotal() {
		total = t1 + t1 + compre;
	}
	public float getTotal() {
		return total;
	}
	public void calcGrade(float cutOffA, float cutOffB, float cutOffC) {
		if (total >= cutOffA) {
			grade = 'A';
		} else if (total >= cutOffA) {
			grade = 'B';
		} else if (total >= cutOffC) {
			grade = 'C';
		} else {
			grade = 'D';
		}
	}
	public char getGrade() {
		return grade;
	}
	void display() {
		System.out.println("I am " + name + " of age " + age);
		System.out.println("My grade is " + grade);
	}
}

public class p4student {
	public static void main(String args[]) {
		Student s = new Student("Max", 18);
		 s.setT1(80);
		 s.setT2(90);
		 s.setCompre(89);
		 s.calcTotal();
		 s.getTotal();
		 s.calcGrade(90, 89, 75);
		 s.getGrade();
		 s.display();
}}
