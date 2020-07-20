import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : print all subsequences of a string
*/

public class printSubsequences {
	
	//function to find subsequences of String : Method 1 Space complexity O(2^n)
	
	public static String[] getSubsequencesOfString(String str) {
		if(str.length()==0)
			{String ans[] = {""};
			return ans;}
		
		String out[] = getSubsequencesOfString(str.substring(1));
		
		String ans[] = new String[2*out.length];
		for(int i=0;i<out.length;++i) {
			ans[i] = out[i];
		}
		
		for(int i=0;i<out.length;++i) {
			ans[i+out.length] = str.charAt(0) + out[i];
		}
		
		return ans;
		
	}
	
	//function to print subsequences of String : Method 2 
	
	public static void printSubsequencesOfString(String input,String output) {
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
		
		printSubsequencesOfString(input.substring(1),output);
		printSubsequencesOfString(input.substring(1),output+input.charAt(0));
		
		
	}
	
	
	
	public static void main(String args[]) {
		
		String str;
		Scanner scan =  new Scanner(System.in);
		
		str = scan.nextLine();
		
//		String arr[] = getSubsequencesOfString(str);
//		//print subsequences
//		for(String s:arr) {
//			System.out.println(s);
//		}
		printSubsequencesOfString(str,"");
		
	}

}
