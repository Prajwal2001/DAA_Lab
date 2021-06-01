/*Program 2.a
Design a superclass called Staff with details as StaffId, Name, Phone, Salary. Extend this 
class by writing three subclasses namely Teaching (domain, publications), Technical 
(skills), and Contract (period). Write a Java program to read and display at least 3 staff 
objects of all three categories.
*/
package daaPrograms;
import java.util.*;
class Staff {
	String staffId, name, phone;
	double salary;
	Scanner read = new Scanner(System.in);
	Scanner read1 = new Scanner(System.in);
	void read() {
		System.out.print("Staff Id: ");
		staffId = read.next();
		System.out.print("Name: ");
		name = read1.nextLine();
		System.out.print("Phone: ");
		phone = read.next();
		System.out.print("Salary: ");
		salary = read.nextDouble();
	}
	void display() {
		System.out.println("Staff Id: " + staffId);
		System.out.println("Name: " + name);
		System.out.println("Phone: " + phone);
		System.out.println("Salary: " + salary);
	}
}

class Teaching extends Staff {
	String domain;
	int publication;
	void read() {
		super.read();
		System.out.print("Domain: ");
		domain = read1.nextLine();
		System.out.print("Publications: ");
		publication = read.nextInt();
	}
	void display() {
		super.display();
		System.out.println("Domain: " + domain);
		System.out.println("Publications: " + publication);
	}
}
class Technical extends Staff {
	String skills;
	void read() {
		super.read();
		System.out.print("Skills: ");
		skills = read1.nextLine();
	}
	void display() {
		super.display();
		System.out.println("Skills: " + skills);
	}
}
class Contract extends Staff {
	int period;
	void read() {
		super.read();
		System.out.print("Period: ");
		period = read.nextInt();
	}
	void display() {
		super.display();
		System.out.print("Period: " + period);
	}
}
public class Program2a {
	public static void main(String args[]) {
		Teaching teaching = new Teaching();
		Technical technical = new Technical();
		Contract contract = new Contract();
		System.out.println("Enter Teaching staff details: ");
		teaching.read();
		System.out.println("\nEnter technical staff details: ");
		technical.read();
		System.out.println("\nEnter Contract staff details: ");
		contract.read();
		System.out.println("\nHere are teaching staff details: ");
		teaching.display();
		System.out.println("\nHere are Technical staff details: ");
		technical.display();
		System.out.println("\nHere are Contract staff details: ");
		contract.display();
	}
}
