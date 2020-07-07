
/*
author : Ayushi Saxena
Problem statement : Bubble sort using iterative and recursive methods
*/

public class BubbleSorting {
	
	//Bubble sort Recursive
	
	public static int[] BubbleSortRecursive(int[] arr,int n) {
		
		if(n==1)
			return arr;
		
		for(int i=0;i<n;++i) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			BubbleSortRecursive (arr,n-1);
		}
		return arr;
		
	}
	//Bubble sort Iterative
	
public static int[] BubbleSortIterative(int[] arr,int n) {
		
		
		for(int i=0;i<n;++i) {
			for(int j=0;j<n-i;++j) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
			}
			//BubbleSortRecursive (arr,n-1);
		}
		return arr;
		
	}
	
	public static void main(String [] args) {
		int arr[] = {5,2,3,1,7};
		
		int [] res = BubbleSortIterative(arr,arr.length-1);
		
		for(int i=0;i<arr.length;++i)
			System.out.print(arr[i] + " ");
	}
}
