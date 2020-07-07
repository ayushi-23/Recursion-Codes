import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : Convert String to Number/ Integer
*/



public class StringToNum {

	//function for converting string to int
	public static int StrToInt(String str,int number,int ptr) {
		 
		// 1234
		// 1*10 + 2 = 12
		//12*10 + 3 =123
		//123*0 + 4 = 1234
		
		
		if(str.length() ==0)
			return number; 
		
		number = number *10 + str.charAt(ptr)-'0';
		
		return StrToInt(str.substring(ptr+1),number,ptr);
		 
		 
	}
	
	public static void main(String args[]) {
		String str;
		Scanner scan = new Scanner(System.in);
		
		str = scan.nextLine();
		
		int num =0;
		
		System.out.println(StrToInt(str,num,0));
		
		
	}
}
