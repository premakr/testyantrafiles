package assignment28;

import java.util.Scanner;

public class Student_marks {

	public static void main(String[] args) {
		
		int marks=0;
		System.out.println(" Enter the marks  of student ");
		Scanner sc=new Scanner(System.in);
		marks=sc.nextInt();
		if(marks<35)
		{
			System.out.println("student is fail  ");
		}
		else if(marks>=85) {
			System.out.println(" student  got distinction ");
		}
		else if(marks>=60) {
			System.out.println(" student is first class");
			
		}
		else if(marks>=35){
			System.out.println("pass");
			
		}

	}

}
