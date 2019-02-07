package patterns30;

public class AlphaTri {

	public static void main(String[] args) {
		int n=4;
		char ch='A';
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-(i+1);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++) {
				System.out.print(ch);
			}
			ch=(char)(ch+2);
			System.out.println();
		}

	}

}
