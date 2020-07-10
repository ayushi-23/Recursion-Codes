import java.util.Scanner;
/*
author : Ayushi Saxena
Problem statement : Count number of times a string occurs in another string
*/



public class StringFinder {
	static int count =0;
	
	//function to count number of times str2 occurs in str1 
	public static int countOccurence(String str1,String str2,int ptr) {
		
		// if string2 is longer than string1
		if(str2.length()>str1.length())
			return 0;
		
		//base case
		if(ptr==str1.length()-str2.length())
			return count;
		
		
		//logic
		if(str1.substring(ptr,ptr+str2.length()).equals(str2)) {
			count++;
		}
		
		return countOccurence(str1,str2,ptr+1);
	}
	
	
	
	public static void main(String args[]) {
		
		String str1,str2;
		Scanner scan = new Scanner(System.in);
		
		str1 = scan.next();
		str2 = scan.next();
		
		System.out.println(countOccurence(str1,str2,0));
	}
}
