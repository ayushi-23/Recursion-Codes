import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : Calculate Number of ways to reach nth stair
*/




public class WaysToGoToNthStair {

	
	public static int countWays(int n) {
		//base case
		if(n<=1)
			return n;
		
		return countWays(n-2)+ countWays(n-1);
		
	}
	
	public static void main(String args[]) {
		int n;
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		System.out.println(countWays(n));
	}
}
