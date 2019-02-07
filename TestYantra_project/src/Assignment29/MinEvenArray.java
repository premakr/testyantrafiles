package Assignment29;

public class MinEvenArray {
	
    public static void main (String[] args) {
	   int[] a= {2,5,6,4,7,0,1,3};
	   int min=a[0];
	   for(int i=0;i<a.length-1;i++) {
		   if(i%2==0) {
		  if(a[i]<min) {
			  min = a[i];
		  }}
	   }
	   System.out.println("minimum value in even index: "+min);
    }
}
