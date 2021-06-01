/*Program 3.a
Write a Java program to read two integers a and b. Compute a/b and print, when b is 
not zero. Raise an exception when b is equal to zero.*/
package daaPrograms;
import java.util.*;
public class Program3a {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String args[]) {
		int a,b;
		float result;
		System.out.println("Enter the values: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		try {
			if(b == 0)
				throw new ArithmeticException("Divide by zero error");
			result = (float)a/b;
			System.out.println("Result is: " + result);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
