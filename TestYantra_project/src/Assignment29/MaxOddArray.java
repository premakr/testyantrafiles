package Assignment29;

public class MaxOddArray {
	
	public static void main(String[] args) {
		int a[]= {2,6,9,8,4,3,5};
		int max=a[0];
		for(int i=0;i<a.length-1;i++) {
			if(i%2==1) {
			if(a[i]>max) {
				max=a[i];
			}}
		}
		System.out.println("maximum value in odd index: "+max);
	}

}
