package assignment28;

public class ReverseArray {
    public static void reverse(int []a, int n) 
    { 
     
        for (int i = 0; i < n / 2; i++) 
        { 
            int tempswap = a[i];  
                a[i] = a[n - i - 1];  
                a[n - i - 1] = tempswap;              
        }  
    } 
    public static void main(String args[]) 
    { 
        int []a = {1, 2, 3, 4, 5, 6}; 
        int n = a.length;
        reverse(a, n); 
        for (int i = 0; i < n; ++i) 
            System.out.print(a[i] + " "); 
    } 
	}