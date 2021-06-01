/*Program 1.a
Create a Java class called Student with the following details as variables within it.
USN
Name
Branch
Phone
Write a Java program to create n student objects and print the USN, Name, Branch, 
and Phone of these objects with suitable headings.
*/

package daaPrograms;
import java.util.*;
class Student {
	String name, usn, branch, phone;
	Student(String name, String usn, String branch, String phone){
		this.name = name;
		this.usn = usn;
		this.branch = branch;
		this.phone = phone;
	}
	void display() {
		System.out.println(usn+"\t\t"+name+"\t\t"+branch+"\t\t"+phone);
	}
}
public class Program1a {
	static Scanner read = new Scanner(System.in), read1 = new Scanner(System.in);
	public static void main(String args[]) {
		Student students[];
		System.out.print("Enter number of students: ");
		int numberOfStudents = read.nextInt();
		students = new Student[numberOfStudents];
		System.out.println("Enter the students details: ");
		for(int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter student " + (i + 1) + " details: ");
			System.out.print("Student usn: ");
			String usn = read.next();
			System.out.print("Student name: ");
			String name = read1.nextLine();
			System.out.print("Student branch: ");
			String branch = read.next();
			System.out.print("Student phone number: ");
			String phone = read.next();
			students[i] = new Student(name, usn, branch, phone);
		}
		System.out.println("Student details: ");
		System.out.println("...................................................................................");
		System.out.println("USN\t\t\tName\t\t\tBranch\t\tPhone");
		System.out.println("...................................................................................");
		for(int i = 0; i < numberOfStudents; i++)
			students[i].display();
	}
}
