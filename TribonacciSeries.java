import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : Print the nth term of tribonacci series
*/


public class TribonacciSeries {

	
	public static int TribonacciSeriesTerm(int n) {
		
		//base cases
		if(n==0)
			return 0;
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		
		//recursive calling
		return TribonacciSeriesTerm(n-1)+TribonacciSeriesTerm(n-2)+TribonacciSeriesTerm(n-3);
					
		
		
	}

	
	public static void main(String [] args) {
		int num;
		
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		
		 System.out.println(TribonacciSeriesTerm(num));
		
	}
	
}
