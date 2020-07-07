/*
author : Ayushi Saxena
Problem statement : Sum triangle of an array 
*/

public class SumTriangle {
	
	public static void SumArrTriangle(int [] A) {
		if (A.length < 1) 
            return; 
  
        // Creating new array which contains the 
        // Sum of consecutive elements in 
        // the array passes as parameter. 
        int[] temp = new int[A.length - 1]; 
        for (int i = 0; i < A.length - 1; i++) 
        { 
            temp[i]= A[i] + A[i + 1]; 
             
        } 
  
        // Make a recursive call and pass 
        // the newly created array 
        SumArrTriangle(temp); 
  
        // Print current array in the end so 
        // that smaller arrays are printed first 
       for(int i=0;i<A.length;++i) 
       {
    	   System.out.print(A[i] + " ");
       }
       System.out.println();
	}
	
	
	public static void main(String [] args) {
		int arr[] = {4,7,3,6,7};
		
		 SumArrTriangle(arr);
		
	}
}
