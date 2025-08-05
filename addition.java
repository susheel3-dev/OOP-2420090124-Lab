package oops101;
import java.util.Scanner;
public class addition {
	public static void add(String args[]) {
		Scanner var=new Scanner(System.in);
		System.out.print("Enter Num1:\t");
		int a=var.nextInt();
		System.out.print("Enter Num2:");
		int b=var.nextInt();
		int c=a+b;
		System.out.println("Sum is:" +c);
		
	}

}
