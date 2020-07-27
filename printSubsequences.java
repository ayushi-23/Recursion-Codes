import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : print all subsequences of a string
*/

public class printSubsequences {
	
	//function to find subsequences of String : Method 1 Space complexity O(2^n)
	
	public static String[] getSubsequencesOfString(String str,int k) {
		if(str.length()==0)
			{String ans[] = {""};
			return ans;}
		
		String out[] = getSubsequencesOfString(str.substring(1),k);
		
		
		String ans[] = new String[2*out.length];
		for(int i=0;i<out.length;++i) {
			if(out[i].length()== k)
			ans[i] = out[i];
		}
		
		for(int i=0;i<out.length;++i) {
			if(out[i].length()== k-1)
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
	// case similar to printing the nodes of tree at kth level
	//print k- length subsequences
	public static void printSubsequencesOfKLength(String input,String output,int k) {
		
		if(k==0)
			{System.out.println(output);
			return;}
		if(input.length()<k) {
			return;
		}
		
		printSubsequencesOfKLength(input.substring(1),output,k);
		printSubsequencesOfKLength(input.substring(1),output+input.charAt(0),k-1);
		
		
	}
	
	public static void main(String args[]) {
		
		String str;
		Scanner scan =  new Scanner(System.in);
		
		str = scan.nextLine();
		int k = 2;
		
//		String arr[] = getSubsequencesOfString(str,k);
//		//print subsequences
//		for(String s:arr) {
//			System.out.println(s);
//		}
		printSubsequencesOfKLength(str,"",3);
		
	}

}
