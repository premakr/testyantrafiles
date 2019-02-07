package assignment28;
import java.util.Scanner;
public class DigitSwapToNextDigit {
	
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number:");
			int num = s.nextInt();
			int temp=num;
			int count =0, srt=0;
			while(temp>0)
			{
				temp=temp/10;
				count++;
			}
			int []num1= new int[count];
			for(int i=0;i<num1.length;i++)
			{
				num1[i]=num%10;
				num=num/10;
				srt = srt*10+num1[i];
			}
			for (int i = 0; i <= num1.length-1; i++) 
			{
				if( ( i+1 ) % 2 == 0 )
			    {
			        int temp1 = num1[i-1];
			        num1[i-1] = num1[i];
			        num1[i] = temp1;
			    }
			}
			System.out.println("After Swapping Every digit with immediate digit: ");
			for(int i=0;i<=num1.length-1;i++) 
			{
				System.out.print(num1[i]);
			}
		}
	}
