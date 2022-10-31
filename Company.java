package cycle3;
class Employee {

	public String name;
	public int age;
	public long phoneNumber;
	public String address;
	public double salary;

	public void printSalary() {

		System.out.println("Salary: " + this.salary);
	}
}

class Officer extends Employee {

	public String specialization;
}

class Manager extends Employee {

	public String department;
}

public class Company {

	public static void main(String[] args) {

		Officer officer = new Officer();
		Manager manager = new Manager();

		officer.name = "Alka Bala";
		officer.age = 25;
		officer.phoneNumber = 987654321;
		officer.address = "27/9 Anna Nagar, Chennai";
		officer.salary = 145000.00;
		officer.specialization = "Software Engineer";

		manager.name = "Albus";
		manager.age = 92;
		manager.phoneNumber = 1234567;
		manager.address = "28 , East Jew Street, Calicut ";
		manager.salary = 2250000.00;
		manager.department = "Public Relations ";

		System.out.println("------ Officer ------");
		System.out.println("Name: " + officer.name);
		System.out.println("Age: " + officer.age);
		System.out.println("Phone number: " + officer.phoneNumber);
		System.out.println("Address: " + officer.address);
		officer.printSalary();
		System.out.println("Specilization: " + officer.specialization);

		System.out.println("------ Manager ------");
		System.out.println("Name: " + manager.name);
		System.out.println("Age: " + manager.age);
		System.out.println("Phone number: " + manager.phoneNumber);
		System.out.println("Address: " + manager.address);
		manager.printSalary();
		System.out.println("Department: " + manager.department);
	}
}