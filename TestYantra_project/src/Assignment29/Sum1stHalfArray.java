package Assignment29;

public class Sum1stHalfArray {

	public static void main(String[] args) {
		int[] num= {8,5,6,9,4,5};
		int n=num.length,sum=0;
        for(int i=0;i<n/2;i++) {
        	sum=sum+num[i];
        }
        System.out.println("sum of 1st half of the array: "+sum);
	}

}
