package Assignment29;

public class AvgOddArray {
	public static double average(int[] a,int n) {
		double avg=0.0;
		for(int i=0;i<n;i++) {
			if(i%2==1) {
			avg=avg+a[i];
		}}
		return avg/n;
	}

	public static void main(String[] args) {
		int[] a= {10,5,9,4,6};
		int n=a.length;
		System.out.println("Average of odd index array: "+average(a, n));

	}

}
