/*Program 1.b
Write a Java program to implement the Stack using arrays. Write Push(), Pop(), and 
Display() methods to demonstrate its working.
*/
package daaPrograms;
import java.util.*;
class Stack {
	Scanner read = new Scanner(System.in);
	int stack[],top = -1, size;
	Stack(int size){
		this.size = size;
		stack = new int[size];
	}
	void push() {
		if(top == size - 1)
			System.out.println("Stack is full!");
		else {
			System.out.print("Enter the element to be pushed: ");
			int element = read.nextInt();
			stack[++top] = element;
		}
	}
	void pop() {
		if(top == -1)
			System.out.println("Stack is empty!");
		else 
			System.out.println("Popped element is " + stack[top--]);
	}
	void display() {
		if(top == -1)
			System.out.println("Stack is empty!");
		else {
			System.out.println("Elements in stack are: ");
			for(int i = top; i >= 0; i--)
				System.out.println("|" + stack[i] + "|");
		}
	}
}
public class Program1b {
	static Scanner read = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.print("Enter the size of the stack: ");
		int size = read.nextInt();
		Stack stack = new Stack(size);
		for(;;) {
			System.out.println("Stack Operation: ");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = read.nextInt();
			switch(choice) {
			case 1: stack.push();
			break;
			case 2: stack.pop();
			break;
			case 3: stack.display();
			break;
			case 4: return;
			default: System.out.println("Invalid choice!");
			}
		}
	}
}
