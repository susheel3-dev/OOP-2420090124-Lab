package oops101;
import java.util.*;
public class student{
public static void main(String args[]){
long StudentId;
String Name;
float Grade;
char Gender;
boolean Status;
System.out.println("Enter StudentID:");
Scanner sc= new Scanner(System.in);
StudentId= sc.nextLong();
System.out.println("Enter Name:");
Name= sc.next();
System.out.println("Enter Grade:");
Grade= sc.nextFloat();
System.out.println("Enter Gender:");
Gender=sc.next().charAt(0);
System.out.println("Enter Status:");
Status= sc.nextBoolean();

System.out.println("---Student details---");
System.out.println("Student ID :"+StudentId);
System.out.println("Name:"+Name);
System.out.println("Grade:"+Grade);
System.out.println("Gender:"+Gender);
System.out.println("Status:"+Status);
}
}