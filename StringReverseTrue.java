import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : Reverse of a number
*/

public class StringReverseTrue {

	//Check if two strings are reverse of each other
	public static Boolean StringsReverseOfEachOther(String str1,String str2,int l,int r) {
		if(str1.charAt(l)!=str2.charAt(r))
		return false;
		if(l==str1.length()-1 && r==0)
			return true;
		
		return (StringsReverseOfEachOther(str1,str2,l+1,r-1));
		
	}
	
	public static void main(String args[]) {
		String str1,str2;
		Scanner scan = new Scanner(System.in);
		
		str1 = scan.nextLine();
		str2 = scan.nextLine();
		if(str1.length()!=str2.length())
			System.out.println("Not reverse of each other");
		else {
		System.out.println(StringsReverseOfEachOther(str1,str2,0,str1.length()-1));
		}
		
	}
}
