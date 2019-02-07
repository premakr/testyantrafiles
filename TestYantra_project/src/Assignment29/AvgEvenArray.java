package Assignment29;

public class AvgEvenArray {
	public static double average(int a[],int n) {
		double avg=0.0;
		for(int i=0;i<n;i++)
		{
			if(i%2==0) {
			avg=avg+a[i];
		}}
		return avg/n;
	}

	public static void main(String[] args) {
		int a[]= {2,5,6,3,2,1};
		int n=a.length;
        System.out.println("Average of even index array: "+average(a, n));
	}

}
