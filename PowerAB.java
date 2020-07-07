import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : Calculate Power (a,b) using recursion
*/




public class PowerAB {
	//calculate power of (a,b)
	
	public static int powerRecursive(int a , int b) {
		
		if(a==1 || b==0) {
			return 1;
		}
		if(b%2==0)
		return a* powerRecursive(a*a,b/2);
		else
			return a*powerRecursive(a,b-1);
	}
	
	
	
	
public static int powerIterative(int a , int b) {
		int pow=1;
		for(int i=0;i<b;++i) {
			pow *=a;
		}
		return pow;
	}
	
	public static void main(String args[]) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println(powerRecursive(a,b));
		
		System.out.println(powerIterative(a,b));
		
	}
}
