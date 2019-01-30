//Find the Kth Largest or Kth Smallest Element in an array
//Quick Select-- a version of Quick Sort
//Average Time Complexity O(N), Worst O(N^2)
//LeetCode- 215

import java.util.Arrays;

class QuickSelect{
	public static void main(String[] args){
		int[] arr = {3,2,1,5,6,4};
		System.out.println(Arrays.toString(arr));

		//find the kth largest number, k =
		int k = 2; 
		int kth = findKthSmallest(arr, arr.length-k);
		System.out.println("Kth Largest Element:" + k + ": " + kth);
	}

	public static int findKthSmallest(int[] arr, int k){
		return quickSelect(arr, 0, arr.length - 1, k);
	}
	public static int quickSelect(int[] arr, int left, int right, int kthLargest){
		System.out.println("L-R: " + left + " ; " + right);
		System.out.println(Arrays.toString(arr));
		if(left == right)
			return arr[left];

		int pivot = (left+right) / 2;
		int pivotIndex = partition(arr, left, right, pivot);

		if(kthLargest == pivotIndex){
			return arr[pivotIndex];
		}else if(kthLargest < pivotIndex){
			return quickSelect(arr, left, pivotIndex-1, kthLargest);
		}else{
			return quickSelect(arr, pivotIndex+1, right, kthLargest);
		}
	}

	public static int partition(int[] arr, int start, int end, int pivot){
		// 1. move pivot to end
	        int pivotValue = arr[pivot];
		swap(arr, pivot, end);
        	int index = start;

		// 2. move all smaller elements to the start
		for(int i = start; i <= end; i++){
			if(arr[i] < pivotValue)
				swap(arr, index++, i);
		}

		// 3. move pivot to its final place
		swap(arr, index, end);
		return index;
	}
  
	public static void swap(int[] A, int i, int j){
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
