package com.epam.java_basic;
import java.util.*;
import com.epam.java_basic.calculator.Calculator;
/**
 * Application's entry point, use it to demonstrate your code execution
 */
public class Application {

    public static void main(String[] args) {
    	Calculator c=new Calculator(1);
    	Scanner sc = new Scanner(System.in);
    	boolean n = true;
    	while(n) {
    	System.out.print("Enter the first number:");
    	double first = sc.nextInt();
    	System.out.print("Enter the second number:");
    	double second = sc.nextInt();
    	System.out.print("Enter operator (+, -, *, /):");
		char op = sc.next().charAt(0);
		switch(op)
		{
			case '+':
				System.out.print("Result: "+c.add(first,second));
				break;
			case '-':
				System.out.print("Result: "+c.subtract(first,second));
				break;
			case '*':
				System.out.print("Result: "+c.multiply(first,second));
				break;
			case '/':
				System.out.print("Result: "+c.div(first,second));
				break;
			default:
				System.out.println("Enter only +,*,/,-");
		}
		System.out.print("Do you want to continue(Y/N):");
		char n1=sc.next().charAt(0);
		if(n1 == 'y' || n1 == 'Y')
			n = true;
		else
			n = false;
    	}
    	System.out.print("Bye!");
    }

}
