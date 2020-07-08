import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : Check whether an string is sorted or not
*/


public class CheckSortedString {

public static boolean CheckSortedStr(String str,int ptr) {
		
		if(str.charAt(ptr)>str.charAt(ptr+1))
			return false;
		if(ptr==0)
			return true;
		
		if(CheckSortedStr(str,ptr-1))
			return true;
		else
			return false;
		
	}
	
	
	
	
	
	public static void main(String [] args) {
		String str;
		Scanner scan =  new Scanner(System.in);
		
		str = scan.nextLine();
		boolean ans = CheckSortedStr(str,str.length()-2);
		
			System.out.print(ans);
	}
	
	
	
	
}
