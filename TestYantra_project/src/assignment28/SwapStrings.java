package assignment28;

import java.util.Scanner;

public class SwapStrings {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String first=s.next();
		System.out.println("Enter 2nd String");
		String second=s.next();
		swap(first,second);
	}
		public static void swap(String first,String second)
		{
			
			System.out.println("Before Swap: "+first+" "+second);
			first=first+second;
			second=first.substring(0,first.length()-second.length());
			first=first.substring(second.length());
			System.out.println("After Swap: "+first+" "+second);
		}
		
	

}

