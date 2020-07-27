/*
author : Ayushi Saxena
Problem statement : print all subsequences of a string including the ascii values of characters too
 For eg : if input string is "ab" then:
 output : _,b,98,a,ab,a98,97,97b,9798
*/



public class printSubAscii {
    public static String[] printSubAsciiStr(String str,int k){
 
    		if(str.length()==0)
    			{String ans[] = {""};
    			return ans;}
    		
    		String out[] = printSubAsciiStr(str.substring(1),k);
    		
    		
    		String ans[] = new String[3*out.length];
    		for(int i=0;i<out.length;++i) {
    			ans[i] = out[i];
    		}
    		
    		for(int i=0;i<out.length;++i) {
    			
    			ans[i+out.length] = str.charAt(0) + out[i];
    		}
    		for(int i=0;i<out.length;++i) {
    			
    			ans[i+out.length+out.length] = (int)str.charAt(0) + out[i];
    		}
    		
    		return ans;

    }

    public static void printSubsequencesAscii(String input,String output) {
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
		
		printSubsequencesAscii(input.substring(1),output);
		printSubsequencesAscii(input.substring(1),output+input.charAt(0));
		printSubsequencesAscii(input.substring(1),output+(int)input.charAt(0));
		
    }

    public static void main(String args[]) {
        String str = "abc";
        //output : _,b,98,a,ab,a98,97,97b,9798
        char ch[] = str.toCharArray();
        //printSubsequencesAscii(str,"");
        String ans[] = printSubAsciiStr(str,0);
        for(String s:ans) {
			System.out.println(s);
		}
    }
}