class Employee {

	private String myName;
	private double mySalary;

	public Employee(String name, double salary) {
		myName = name;
		mySalary = salary;
	}

	public String getName() {
		return myName;
	}

	public double getSalary() {
		return mySalary;
	}

	public void raiseSalary(int percent) {
		mySalary = mySalary + percent * 0.01 * mySalary;
	}

	public void setSalary(double salary) {
		mySalary = salary;
	}

	public String toString() {
		return "Name: " + getName() + ", Salary: " + getSalary();
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee mal = new Employee("Nathan Fillion", 25000.0);
		System.out.println("mal's salary: " + mal.getSalary());
		mal.raiseSalary(10);
		System.out.println("mal's salary: " + mal.getSalary());
		mal.raiseSalary(10);
		System.out.println("mal's salary: " + mal.getSalary());
		mal.setSalary(40000.0);
		System.out.println("mal's salary: " + mal.getSalary());

		Employee zoe = new Employee("Gina Torres", 15000.0);
		System.out.println("zoe's salary: " + zoe.getSalary());
		zoe.raiseSalary(5);
		System.out.println("mal's salary: " + zoe.getSalary());
		zoe.raiseSalary(5);
		System.out.println("mal's salary: " + zoe.getSalary());

		Employee river = new Employee("Summer Glau", 22222.22);
		System.out.println("river's salary: " + river.getSalary());
		System.out.println(river);

		Employee jayne = new Employee("Adam Baldwin", 27000.0);
		System.out.println(jayne);
	}
}