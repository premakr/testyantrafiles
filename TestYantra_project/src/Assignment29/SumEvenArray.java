package Assignment29;

public class SumEvenArray {
	public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6 }; 
        int even = 0;
  
        // Loop to find even sum 
        for (int i = 0; i < arr.length; i++) { 
            if (i % 2 == 0) 
                even += arr[i]; 
        } 
        System.out.println("Even index positions sum: " + even); 
    } 
} 
