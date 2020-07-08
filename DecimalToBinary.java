import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : Convert Decimal to Binary Recursively
*/


public class DecimalToBinary {

	//function for recursively convert decimal to binary
	public static void ConvertDecimalToBinary(int num) {
		//base case
		if(num==0)
			return;
		
		//logic
		
		int out = num%2;
		
		ConvertDecimalToBinary(num/2);
		
		
		//print 
		System.out.print(out);

		
	}
	
	
	
	public static void main(String args[]) {
		
		int num;
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		
		ConvertDecimalToBinary(num);
	}
}
