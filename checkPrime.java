import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : check if a number is prime or not
*/


public class checkPrime {

	
	public static boolean checkPrimeOrNot(int num,int i ){
		//base case
		
		 if (num <= 2) 
	            return (num == 2) ? true : false; 
	        if (num % i == 0) 
	            return false; 
	        if (i * i > num) 
	            return true;
	        
	       return checkPrimeOrNot(num,i+1);
		
		
	}
	
	

	public static void main(String [] args) {
		int a,b;
		
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		
		 System.out.println(checkPrimeOrNot(a,2));
		
	}
	
}
