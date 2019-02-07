package assignment28;
import java.util.Scanner;
public class SwapIndexElements {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the size of the array:");
			int size = s.nextInt();
			int []a= new int[size];
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter the value ofa["+i+"]");
			a[i] = s.nextInt();
		}
		System.out.println("Enter the Index1 for swapping:");
		int ind1 = s.nextInt();
		System.out.println("Enter the Index2 for swapping:");
		int ind2 = s.nextInt();
		swap(a,ind1,ind2);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		}
			public static int[] swap(int []a, int x,int y) 
			{
				a[x]= a[x]+a[y];
				a[y] = a[x]-a[y];
				a[x] = a[x]-a[y];
				return a;
			}
	}