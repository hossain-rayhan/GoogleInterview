//Can search only in sorted arrays
//Time Complexity O(N), Space Complexity O(1)
//To compile: javac BinarySearch.java, and To run: java BinarySearch
//Developed By: Rayhan Hossain (Mukla.C) on 2019/01/14

import java.util.Arrays;

class BinarySearch{
	public static void main(String[] args){
		int[] sortedArray = {-10, -4, 0, 2, 13, 226, 1000};
		//int index = binarySearchIterative(sortedArray, 0, sortedArray.length - 1, -100);
		int index = binarySearchRecursive(sortedArray, 0, sortedArray.length - 1, 1000);

		System.out.println("Index: " + index);
	}

	public static int binarySearchIterative(int[] arr, int left, int right, int value){
		while(left <= right){
			int mid = (left + right)/ 2;
			if(arr[mid] == value){
				return mid;
			}else if(arr[mid] < value){
				left = mid + 1;
			}else if(arr[mid] > value){
				right = mid - 1;
			}
		}
		return -1;
	}

	public static int binarySearchRecursive(int[] arr, int left, int right, int value){
		if(right < left){
			return -1;
		}
		int mid = (left + right)/2;

		if(arr[mid] == value){
			return mid;		
		}else if(arr[mid] < value){
			return binarySearchRecursive(arr, mid + 1, right, value);
		}else{
			return binarySearchRecursive(arr, left, mid - 1, value);
		}
	}
}
