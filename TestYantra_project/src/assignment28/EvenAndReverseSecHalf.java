package assignment28;

public class EvenAndReverseSecHalf {
	  static void reverse(int []a, int i,int j) 
	    { 
		  
	    	if(i>j)
	    		return;
	    	else {
	            int tempswap = a[i];  
	                a[i] = a[j];  
	                a[j] = tempswap; 
	                reverse(a, ++i, --j);
	    	}
	     }  
	    public static void main(String args[]) 
	    { 
	        int []a = {1, 2, 3, 4, 5, 6}; 
	        int n = a.length/2,k=a.length-1;
	        reverse(a, n, k);
	        for (int i = 0; i <=a.length-1; i++) {
	            System.out.print(a[i] + " "); 
	    }
	}

}
