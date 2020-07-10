/*
author : Ayushi Saxena
Problem statement : Sorting array using Merge Sort
*/




public class MergeSort {

	
	//performing merge operation
	public static void merge(int arr[],int []left,int[] right,int num,int ln,int rn) {
		
		int i=0,j=0,k=0;
		//comparing elements in left array and right array
		while(i<ln && j< rn) {
			
			if(left[i]<right[j]) {
			arr[k] = left[i];
			++i;
			++k;
		}
		
			else {
			arr[k] = right[j];
			++j;
			++k;
		}
			
		}
		
		
		//Elements which are remaining are inserted in array
		while(i<ln) {
			arr[k] = left[i];
			++i;
			++k;
		}
		while(j<rn) {
			arr[k] = right[j];
			++j;
			++k;
		}
		
	}
	
	
	//performing sorting recursively
	public static void mergeSort(int[] arr,int n) {
		int i;
		//base case
		if(n<2) {
			return;
		}
		//creating two sub arrays
		int mid = n/2;
		int[] left = new int[mid];
		int[] right = new int[n-mid];
		
		for(i=0;i<mid;++i) {
			left[i] = arr[i];
		}
		for(i=0;i<n-mid;++i) {
			right[i] = arr[i+mid];
		}
		
		//recursive calls
		mergeSort(left,mid);
		mergeSort(right,n-mid);
		merge(arr,left,right,n,mid,n-mid);
	}
	
	
	public static void main(String args[]) {
		
		int arr[] = {4,6,100,2,1,8,3};
		mergeSort(arr,arr.length);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}
}
