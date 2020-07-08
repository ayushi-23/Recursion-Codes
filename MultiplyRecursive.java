import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : Multiply two numbers recursively 
*/


public class MultiplyRecursive {
	public static int MultiplyNum(int a,int b) {
		//base case
		if(b==1)
			return a;
		
		return a+MultiplyNum(a,b-1);
	}
	
	

	
	public static void main(String [] args) {
		int a,b;
		
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		 System.out.println(MultiplyNum(a,b));
		
	}
	
	
}
