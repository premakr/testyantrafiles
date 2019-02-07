package assignment28;

import java.util.Scanner;

public class AtomicNumber {

	public static void main(String[] args) {
		System.out.println(" Enter the Atomic Number ");
		Scanner sc=new Scanner(System.in);
	    int number = sc.nextInt();
	    switch (number) {
		case 1:System.out.println("Hydrogen");
		break;
		case 2:System.out.println("Helium");
		break;
		case 3:System.out.println("Lithium");
		break;
		case 4:System.out.println("Berilium");
		break;
		case 5:System.out.println("Boron");
		break;
		case 6:System.out.println("Carbon");
		break;
		case 7:System.out.println("Nitrogen");
		break;
		case 8:System.out.println("Oxygen");
		break;
		case 9:System.out.println("Flourine");
		break;
		case 10:System.out.println("Neon");
		break;
		default:System.out.println("Invalid atomic number");
		break;
	    }
    }
}
