package assignment28;

import java.util.Scanner;

public class FirstToSecAndSecToFirst {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		swap(a);
	}
		public static void swap(int a)
		{
		  String num = Integer.toString(a);
		  String firsthalf = num.substring(num.length()/2);
		  String secondhalf = num.substring(0,num.length()/2);
		  String revnum = firsthalf+secondhalf;
		  int revnum1 = Integer.parseInt(revnum);
		  System.out.println(revnum1);
		}
}
