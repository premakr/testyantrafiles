package patterns30;

public class TriNum1 {

	public static void main(String[] args) {
		int n=4,k=1,ch=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-(i+1);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<ch;j++) {
				if(j==0||j==ch-1) {
				System.out.print(k);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			k++;
			ch=ch+2;
		}
	}

	}
