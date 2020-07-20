import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : Can we reach coordinates (x2,y2) from (x1,y1)
*/




public class ReachCoordinates {
	//function to check if we can reach coordinates x2,y2 or not
	public static boolean canWeReachCoordinates(int x1,int y1,int x2,int y2) {
		//base case
		if(x1==x2 && y1 == y2) {
			return true;
		}
		if(x1>x2 || y1>y2)
			return false;

		boolean ans1 = canWeReachCoordinates(x1+y1,y1,x2,y2);
		boolean ans2 = canWeReachCoordinates(x1,x1+y1,x2,y2);
		
		return ans1 || ans2;
		
		
	}

	
	
	public static void main(String args[]) {
		int x1,y1,x2,y2;
		
		Scanner scan = new Scanner(System.in);
		
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		
		System.out.println(canWeReachCoordinates(x1,y1,x2,y2));
		
	}
	
}
