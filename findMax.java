
public class findMax {
	//Min value fetched from system
	public static int max = Integer.MIN_VALUE;
	public static int findMaxNo(int[] arr,int ptr) {
		//base case
		if(ptr==arr.length-1)
			return max;
		
		
		//logic 
		//decision first
		if(arr[ptr]>max) {
			max = arr[ptr];
		}
		//recursion call later
		return findMaxNo(arr,ptr+1);
		
		
	}
	
	//approach two
	public static int findMaxNum2(int arr[],int ptr) {
		
		if(ptr==0) {
			return arr[ptr];
		}
		
		
		int out = findMaxNum2(arr,ptr-1);
		//max function in built
		return Math.max(out, arr[ptr]);
	}
	
	public static void main(String args[]) {
		
	 int arr[] = {-1,-5,-2,9,-8};
		
		//System.out.println(findMaxNo(arr,0));
		
		System.out.println(findMaxNum2(arr,arr.length-1));
	}
}
