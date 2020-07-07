import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : Sum of a number
*/

public class sumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rem,sum=0;
		Scanner scan  = new Scanner(System.in);
		
		n = scan.nextInt();
		
		while (n!=0) {
			rem = n%10;
			sum +=rem;
			n = n/10;
		}
		
		System.out.println(sum);
	}

}
