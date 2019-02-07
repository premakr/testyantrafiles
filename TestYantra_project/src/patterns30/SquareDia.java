package patterns30;

public class SquareDia {

	public static void main(String[] args) {
		int n=5,k=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j||i+j==n-1) {
					System.out.print(k);
				}
				else
					System.out.print(" ");
			}
			k--;
			System.out.println();
		}
		 

	}

}
