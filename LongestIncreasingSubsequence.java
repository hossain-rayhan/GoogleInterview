//Longest Increasing Subsequence
//https://www.youtube.com/watch?v=fV-TF4OvZpk
//Dynamic Programming. Time Complexity O(N^2)

import java.util.Arrays;

class LongestIncreasingSubsequence{
	public static void main(String[] args){
		int[] arr = {12, 3, -4, 4,  4, 5, 8, 6, 1, 10};
		System.out.println(Arrays.toString(arr));
		lis(arr);
	}

	public static void lis(int[] arr){
		int[] counter = new int[arr.length];
		int[] previous = new int[arr.length];

		for(int i = 0; i < arr.length; i++){
			counter[i] = 1;
			previous[i] = i;
		}

		int maxCount = 0, maxIndex = 0;
		for(int i = 1; i < arr.length; i++){
			for(int j = 0; j < i; j++){
				if(arr[i] > arr[j]){
					if(counter[j] + 1 > counter[i]){
						counter[i] = counter[j] + 1;
						previous[i] = j;

						if(counter[i] > maxCount){
							maxCount = counter[i];
							maxIndex = i;
						}
					}
				}
			}
		}
		
		System.out.println("Length of LIS: " + maxCount +" LastIndex: " + maxIndex);
		for(int i = 1; i <= maxCount; i++){
			System.out.print(arr[maxIndex] + " ");
			maxIndex = previous[maxIndex];
		}
		System.out.println();
	}
}

