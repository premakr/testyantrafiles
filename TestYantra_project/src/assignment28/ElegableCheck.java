package assignment28;

import java.util.Scanner;

public class ElegableCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Enter the Gender of Person ");
		Scanner sc=new Scanner(System.in);
	    String gender = sc.next();
		System.out.println("Enter the age");
		int age = sc.nextInt();
		if(gender.equals("male") && age>=21) {
			System.out.println("This person is eligible for marriage");
		}
		else if(gender.equals("female")&& age>=18) {
			System.out.println("This person is eligible for marrige");
		}
		else {
			System.out.println("This person is not eligible for marriage");
		}

	}

}
