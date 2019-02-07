package assignment28;

import java.util.Scanner;

public class SwapNumbers {
	
		public static void swap(int fn,int sn)
		{
			fn = fn+sn;
			sn = fn-sn;
			fn = fn-sn;
			System.out.println("from swapping");
			System.out.println("first number: "+fn);
			System.out.println("second number: "+sn);
		}
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number");
			int first_number = sc.nextInt();
			System.out.println("Enter the second number");
			int second_number = sc.nextInt();
			System.out.println("before swaping");
			System.out.println("fisrt number: "+first_number);
			System.out.println("second number: "+second_number);
			swap(first_number,second_number);
		}
	}
