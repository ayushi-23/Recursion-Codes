import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : Tower of Hanoi problem
*/



public class towerOfHanoi {
	static int counter=0;
	public static void TowerOfHanoi(int n, char from, char to, char aux) {
		//base case
		counter++;
		if(n==1) {
			System.out.println("Move " + n + " to " + to + " from " + from);
			return;
		}
		
		
		//for n-1 disks
		
		TowerOfHanoi(n-1,from,aux,to);
		System.out.println("Move " + n + " to " + to + " from " + from);
		TowerOfHanoi(n-1,aux,to,from);
		
		
	}
	
	
	
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		TowerOfHanoi(n,'A','C','B');
		System.out.println(counter);
	}
}
