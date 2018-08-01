class Employee {
	public String name;
	String address;
	protected int salary;
	public int RRN;

	public String toString() {
		return name + "," + address + "," + RRN + "," + salary;
	}
}

class Manager extends Employee {
	private int bouns;

	public void printSalary() {
		System.out.println(name + "(" + address + "):" + (salary + bouns));
	}

	public void printRRN() {
		System.out.println(RRN);
	}
}

public class ManagerTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.printRRN();
		System.out.println(m.toString());

	}

}
