package patterns30;

public class p1 {

	public static void main(String[] args) {
		int n=4,sp=3;
		for(int i=0;i<n;i++,sp--) {
			for(int j=0;j<sp;j++) {
			System.out.print(" ");
			}
			int k=i+1;
			for(int j=0;j<i*2+1;j++) {
				
				if(j<(i*2+1)/2) {
					System.out.print(k--);
				}
				else
					System.out.print(k++);
			}
			System.out.println();
		}
	}
}
