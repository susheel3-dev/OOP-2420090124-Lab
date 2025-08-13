package task2;
import java.util.Scanner;
public class vowelornot {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String ch;
		System.out.println("Enter a character:");
		ch=sc.next();
		if(ch=="a"|| ch=="e" || ch=="i" || ch== "o" || ch== "u" ) {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
	}
}
