package task2; 

import java.util.*;
public class GCD {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		int temp = 0;

		System.out.println("Enter number 1:");
		a = sc.nextInt();
		System.out.println("Enter number 2:");
		b = sc.nextInt();

		while (b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}

		System.out.println("GCD is: " + a);
	}
}
