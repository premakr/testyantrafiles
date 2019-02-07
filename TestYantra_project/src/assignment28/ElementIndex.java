package assignment28;

public class ElementIndex {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		int search=30;
		for(int i=0;i<a.length;i++) {
			if(search==a[i])
			{
				System.out.println(" element present: "+search+" in the index: "+i);
			}		
		}
	}
}
