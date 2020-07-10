import java.util.Scanner;

/*
author : Ayushi Saxena
Problem statement : Find min and max elements from an array
*/





public class minMaxFromArray {

	static int ans[] = new int[2];
	//function to find out min and max elements
	public static int[] minMax(int[] arr,int ptr,int min,int max) {
		
		if(arr.length<=1)
			return arr;
		//base case
		if(ptr == arr.length-1)
			return ans;

		//logic	
			if(arr[ptr]>arr[0])
				max = arr[ptr];
			if(arr[ptr]<min)
				min = arr[ptr];
		
		ans[0] = min;
		ans[1] = max;
		minMax(arr,ptr+1,min,max);
		return ans;
	}
	
	
public static void main(String args[]) {
		
		int [] arr = {5,7,2,1,0};
		int ans[] = minMax(arr,0,0,0);
		
		System.out.println("Min : "+ ans[0]);
		System.out.println("Max : " + ans[1]);
	}
}
