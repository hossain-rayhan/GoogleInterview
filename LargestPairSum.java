//Get the largest sum of Pairs from unsorted array

import java.util.Arrays;

class LargestPairSum{
	public static void main(String[] args){
		int[] arr = {2, 3, -1, 0, 30, 6, 13, 40};
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum of Largest Paris: " + getLargestSumOfPairs(arr));
	}
	public static int getLargestSumOfPairs(int[] arr){
		int sum = 0, first = 0, second = 0;

		if(arr[0] > arr[1]){
			first = arr[0];
			second = arr[1];
		}else{
			second = arr[0];
			first = arr[1];
		}
		for(int i = 2; i < arr.length; i++){
			if(arr[i] > first){
				second = first;
				first = arr[i];
			}else if(arr[i] > second){
				second = arr[i];
			}
		}
		sum = first + second;
		return sum;
	}
}
