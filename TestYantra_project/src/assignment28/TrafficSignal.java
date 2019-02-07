package assignment28;

import java.util.Scanner;

public class TrafficSignal {

	public static void main(String[] args) {
		System.out.println(" Enter the Colour of Signal ");
		Scanner sc=new Scanner(System.in);
	    String color = sc.next();
	    switch (color) {
		case "orange":System.out.println("caution:ready to stop");
			
			break;
		case "amber":System.out.println("caution:ready to start");
		
		break;
		case "yellow":System.out.println("caution:Be ready");
		
		break;
		case "red":System.out.println("stop");
		
		break;
		case "green":System.out.println("Go");
		
		break;

		default:System.out.println("Invalid Signal Color");
			break;
		}

	}

}
