/*
author : Ayushi Saxena
Problem statement : Check whether an array is sorted or not
*/
public class CheckSorted {

	public static boolean CheckSortedArr(int []arr,int ptr) {
		
		if(arr[ptr]<arr[ptr-1])
			return false;
		if(ptr==1)
			return true;
		
		if(CheckSortedArr(arr,ptr-1))
			return true;
		else
			return false;
		
	}
	
	
	
	
	
	public static void main(String [] args) {
		int arr[] = {5,6};
		
		boolean ans = CheckSortedArr(arr,arr.length-1);
		
		//for(int i=0;i<arr.length;++i)
			System.out.print(ans);
	}
	
}
