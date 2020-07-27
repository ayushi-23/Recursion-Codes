import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : print all subsequences of a string except duplicate ones
*/



public class duplicateSubsequences {
	public static HashSet<String> h = new HashSet<String>();
	
	
	public static String[] getSubsequencesOfString(String str) {
		if(str.length()==0)
			{String ans[] = {""};
			return ans;}
		
		String out[] = getSubsequencesOfString(str.substring(1));
		
		int k=0;
		String ans[] = new String[2*out.length];
		String output[] = new String[2*out.length];
		for(int i=0;i<out.length;++i) {
			
				ans[i] = out[i];
		
			
	}
		for(int i=0;i<out.length;++i) {
		ans[i+out.length] = str.charAt(0) + out[i];
				
		}
		
		for(int i=0;i<ans.length;++i) {
			h.add(ans[i]);
			
		}
		
		String[] array = new String[h.size()];
	     h.toArray(array);
		return array;
		
	}


	public static void main(String args[]) {
		
		String str;
		Scanner scan =  new Scanner(System.in);
		
		str = scan.nextLine();
		
		String arr[] = getSubsequencesOfString(str);
		//print subsequences
		for(String s:arr) {
			System.out.println(s);
		}
//		printSubsequencesOfString(str,"");
		
	}
	
	
}
