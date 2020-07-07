import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : Reverse of a number
*/

public class PrintSequence {

	//print nos having digits 2 or 5 or both
	public static void PrintSequences(int n) {
		//int m = n;
		if(n<2)
			return ;
		
		PrintSequences(n-1);
		
		if(n==2 || n==5 ||n==25||n==55||n==52 ||n==22)
			System.out.println(n);
	}
	
	public static void main(String args[]) {
		int n;
		Scanner scan =  new Scanner(System.in);
		n = scan.nextInt();
		
		PrintSequences(n);
		
		scan.close();
	}
}
