/*package whatever //do not write package name here */

/*
author : Ayushi Saxena
Problem statement : Find sum of digits recursively
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class sumofDigits {
    public static int sumOfDigits(int n){
        if (n<=0)
        return 0;
        
        return  (n%10 + sumOfDigits(n/10));
    }
    
    
	public static void main (String[] args) {
		//code
		
		int T;
		Scanner scan = new Scanner(System.in);
		 T = scan.nextInt();
		for (int i=0;i<T;++i){
		    int n = scan.nextInt();
		    
		    System.out.println( sumOfDigits(n));
		    
		}
	}
}