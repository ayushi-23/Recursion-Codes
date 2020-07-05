import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : Reverse of a number
*/


public class StringToNum {

	//function for converting string to int
	public static int StrToInt(String str,int ptr) {
		if(ptr == str.length())
		return Integer.valueOf(str);
		
		return ( Integer.valueOf(str.charAt(ptr)) + StrToInt(str,ptr-1)*10);
		
	}
	
	public static void main(String args[]) {
		String str;
		Scanner scan = new Scanner(System.in);
		
		str = scan.nextLine();
		
		System.out.println(StrToInt(str,str.length()));
		
		
	}
}
