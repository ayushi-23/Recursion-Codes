import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : Reverse the string
*/



public class ReverseString {
	//Reverse the string
	
	//ABCD
	//DCBA
	
	public static String ReversalOfString(String str,int l, int r) {
		if(l == r || l>r) {
			return str;
		}
		
		
		char ch[] = str.toCharArray();
		
		char temp = ch[l];
		ch[l] = ch[r];
		ch[r] = temp;
		
		str = String.valueOf(ch);
 		
		return	ReversalOfString (str,l+1,r-1);
			
	}
	
	
	public static void main(String []args) {
		String str;
		Scanner scan = new Scanner(System.in);
		
		str = scan.nextLine();
		
		System.out.println(ReversalOfString(str,0,str.length()-1));
	}
}
