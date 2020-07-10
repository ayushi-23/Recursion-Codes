import java.util.Random;

public class RandomizedQuickSort {

	
	
public static int partition(int[]arr,int start,int end) {
		
		int pivot = arr[end];
		int partitionIndex = start;
		
		
		for(int i=start; i<=end-1; ++i){ 

			if(arr[i] <= pivot){
			//swap: arr[i],arr[partitionIndex] 
			int temp = arr[i];
			arr[i] = arr[partitionIndex];
			arr[partitionIndex] = temp;
			
			partitionIndex++;
			
		}
		
	}
		
		//swap arr[end] and element at partitionIndex
		int temp = arr[end];
		arr[end] = arr[partitionIndex];
		arr[partitionIndex] = temp;
		
		return partitionIndex;
		
	}
	
	public static void quickSort(int [] arr, int start,int end)
	{
		
		if(start>=end)
			return;
		
		int partitionIndex = partition(arr,start,end);
		
		quickSort(arr,start,partitionIndex-1);
		
		quickSort(arr,partitionIndex+1,end);
		
		
		
	}
	static	void  shuffle(int [] arr, int start, int end){

		 

		int index = 0; 

		for(int i=end; i>=start; --i){ 

		 

		// generate a random number between 0 to i+1 
			Random rand = new Random();
			index = rand.nextInt((arr.length));
		
			//swap arr[i] and arr[index]
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index]= temp;
		}
		} 
	
	public static void main(String args[]) {
		
		int arr[] = {4,6,100,2,1,8,3};
		
		//Shuffle the array if array is already sorted
		shuffle(arr,0,arr.length-1);
		
		quickSort(arr,0,arr.length-1);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}
}
