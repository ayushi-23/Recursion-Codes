/*package whatever //do not write package name here */

/*
author : Ayushi Saxena
Problem statement : Check whether a String is palindrome or not
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class palindrome {
    public static String checkPalindrome(String str, int l,int r){
        if(str.charAt(l)!=str.charAt(r))
            return "No";
        if (l>r)
            return "Yes";
        if(l==r)
        return "Yes";
      return  checkPalindrome(str,l+1,r-1);    
    }
    
    
	public static void main (String[] args) {
		//code
		
		int T;
		Scanner scan =  new Scanner(System.in);
		T = scan.nextInt();
		
		for(int i=0;i<T;++i){
		    int len = scan.nextInt();
		    String str = scan.next();
		   System.out.println( checkPalindrome(str,0,len-1));
		    
		}
	}
}