/*Program 2.b
Write a Java class called Customer to store their name and date_of_birth. The 
date_of_birth format should be dd/mm/yyyy. Write methods to read customer data as
<name, dd/mm/yyyy> and display as <name, dd, mm, yyyy> using StringTokenizer
class considering the delimiter character as “/”*/
package daaPrograms;
import java.util.*;

class Customer {
	String data, name, dateOfBirth;
	Scanner read = new Scanner(System.in);
	void read() {
		System.out.println("Enter data in the form <name, dd/mm/yyyy>");
		data = read.nextLine();
	}
	void display() {
		String []s = data.split(",");
		name = s[0];
		dateOfBirth = s[1];
		StringTokenizer str = new StringTokenizer(dateOfBirth,"/");
		System.out.println(name + ", " + str.nextToken() + ", " + str.nextToken() + ", " + str.nextToken());	
	}
}

public class Program2b {
	public static void main(String args[]) {
		Customer customer = new Customer();
		customer.read();
		customer.display();
	}
}
