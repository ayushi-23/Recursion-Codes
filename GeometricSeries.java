import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : Reverse of a number
*/

public class GeometricSeries {
	//geometric sum of the type 1+1/2+1/4+... 
	public static double GeometricSeriesPrint(int n) {
		//int m = n;
		if(n==0)
			return 1;
		
		double sum = 1/Math.pow(2, n) + GeometricSeriesPrint(n-1);
		
		
		return sum;
		
	}
	
	public static void main(String args[]) {
		int n;
		Scanner scan =  new Scanner(System.in);
		n = scan.nextInt();
		
		System.out.println(GeometricSeriesPrint(n));
		
		scan.close();
	}
}
