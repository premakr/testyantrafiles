package Assignment29;

public class SumOddArray {
	public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6 }; 
        int odd = 0; 
  
        // Loop to find odd sum 
        for (int i = 0; i < arr.length; i++) { 
            if (i % 2 == 0) 
                odd += arr[i]; 
        } 
        System.out.println("Odd index positions sum: " + odd); 
    } 
} 
