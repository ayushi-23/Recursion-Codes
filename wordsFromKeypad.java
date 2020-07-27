import java.util.HashMap;
import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : print all words possible from a combination of digits from phone keypad
*/


public class wordsFromKeypad {
	public static HashMap<Integer,String> map = new HashMap<Integer,String>();
	public static String[] getCombinations(String input) {
		
		//base case
		if(input.length()==0) {
			String ans[] = {""};
			return ans;
		}
		
		String arr[] = getCombinations(input.substring(1));
		String current = map.get(input.charAt(0)-'0');
		
		if(current == "")
			return arr;
		
		int k=0;
		String ans[] = new String[current.length()*arr.length];
		
		for(int i=0;i<arr.length;++i) {
			for(int j=0;j<current.length();++j) {
				ans[k] = current.charAt(j) + arr[i];
				++k;
			}
		}
		return ans;
	}
	
	
	public static void main(String args[]) {
		map.put(1,"");
		map.put(2,"abc");
		map.put(3,"def");
		map.put(4,"ghi");
		map.put(5,"jkl");
		map.put(6,"mno");
		map.put(7,"pqrs");
		map.put(8,"tuv");
		map.put(9,"wxyz");
		
		Scanner scan =  new Scanner(System.in);
		String num = scan.next();
		String ans[] = getCombinations(num);
		
		for(String str:ans) {
			System.out.println(str);
		}
		
	}
	
}
