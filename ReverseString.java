import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : Reverse of a number
*/


public class ReverseString {
	//Reverse the string
	
	public static void ReverseTheString(String str) {
		String strRev = "";	
		if(str.length()<=1 || str.equals(null))
			System.out.print(str);
		else {
			System.out.print(str.charAt(str.length()-1));
			ReverseTheString(str.substring(0,str.length()-1));
		}
	}
	
	public static void main(String []args) {
		String str;
		Scanner scan = new Scanner(System.in);
		
		str = scan.nextLine();
		
		ReverseTheString(str);
	}
}
