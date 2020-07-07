import java.util.Scanner;


/*
author : Ayushi Saxena
Problem statement : Calculate Ways to put Tiles of size 2X1 on a  2Xn space
*/



public class TilingProblem {

	public static int TilingWays(int n) {
		
		//for 2X1 space, only 1 way is possible
		if(n==1)
			return 1;
		
		// for 2X2 space, only 2 ways are possible
		if(n==2)
			return 2;
		
		int way1 = TilingWays(n-1);
		
		int way2 = TilingWays(n-2);
		
		return way1+way2;
		
		
	}
	
	
	
	public static void main(String args[]) {
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		System.out.println(TilingWays(n));
		
		
		
	}

}
