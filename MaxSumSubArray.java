//Maximum Sum Subarray- Kadane's Algorithm
//Largest Sum contiguous subArray
//https://www.youtube.com/watch?v=kekmCQXYwQ0&t=2s

import java.util.Arrays;

class MaxSumSubarray{
	public static void main(String[] args){
		int[] arr = {-4, -1, -2};
		kadanesMaxSumSubarray(arr);
	}
	public static void kadanesMaxSumSubarray(int[] arr){
		System.out.println(Arrays.toString(arr));

		int maxGlobal = arr[0], maxEndingHere = 0;
		int start = 0, end = 0, s = 0;

		for(int i = 0; i < arr.length; i++){
			maxEndingHere = maxEndingHere + arr[i];

			if(maxGlobal < maxEndingHere){
				maxGlobal = maxEndingHere;
				start = s;
				end = i;
			}
			if(maxEndingHere < 0){
				maxEndingHere = 0;
				s = i + 1;
			}
		}
		System.out.println("Start: " + start + "; End: " + end);
		System.out.println("Max Sum: " + maxGlobal);
	}
}
