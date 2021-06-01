/*Program 3.b
Write a Java program that implements a multi-thread application that has three threads. 
First thread generates a random integer for every 1 second; second thread computes the 
square of the number and prints; third thread will print the value of cube of the number.
*/
package daaPrograms;
import java.util.*;
class MyThread1 extends Thread {
	Scanner scanner = new Scanner(System.in);
	public void run() {
		int i = 1;
		System.out.println("Enter the number of random number to be generated: ");
		int n = scanner.nextInt();
		try {
			while(i <= n) {
				Random random = new Random();
				Program3b.r = random.nextInt(100);
				System.out.println(i + " -> random number generated is: " + Program3b.r);
				new MyThread2().start();
				new MyThread3().start();
				Thread.sleep(1000);
				System.out.println("\n\n");
				i++;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class MyThread2 extends Thread {
	public void run() {
		System.out.println("Square of " + Program3b.r + " is equal to " + (Program3b.r * Program3b.r));
	}
}
class MyThread3 extends Thread {
	public void run() {
		System.out.println("Cube of " + Program3b.r + " is equal to " + (Program3b.r * Program3b.r * Program3b.r));
	}
}
public class Program3b {
	static int r;
	public static void main(String args[]) {
		MyThread1 myThread1 = new MyThread1();
		myThread1.start();
	}
}
