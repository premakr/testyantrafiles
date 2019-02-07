package patterns30;

public class TriNum {

	public static void main(String[] args) {
		int n=4,k=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-(i+1);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++) {
				if(j%2==0) {
				System.out.print(k);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			k++;
		}
	}

}
