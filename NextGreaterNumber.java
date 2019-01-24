//Find the Next Greater Number with same set of Digits
//If the digits are in descending order, we cannot get a greater number with same digits
//If not possible, then print Not Possible
//Amazon Interview Question

import java.util.Arrays;

class NextGreaterNumber{
	public static void main(String[] args){
		int[] digits = {1, 0, 0, 0};
		System.out.println("Orginal Digits: " + Arrays.toString(digits));
		nextGreaterNumber(digits);
	}

	public static void nextGreaterNumber(int[] digits){
		int index = digits.length - 1;
		while(index > 0){
			if(digits[index] > digits[index-1]){
				break;
			}
			index--;
		}
		//if all digits are in descending order, then index == 0
		//If index == 0, we cannot get a greater number with these digits

		if(index == 0){
			System.out.println("We cannot get a greater number with these digits.");
		}else{
			//Find the smallest digit on the right side of (index-1) which 
			//is greater than the digit of (index-1) position

			int minIndex = index;
			for(int i = index + 1; i < digits.length; i++){
				if(digits[i] > digits[index-1] && digits[i] <= digits[minIndex]){
					minIndex = i;
				}
			}

			//Swap the digit of minIndex with the digit of (index-1)
			int temp = digits[minIndex];
			digits[minIndex] = digits[index-1];
			digits[index-1] = temp;

			//Sort the digits after (index-1) position in ascending order
			Arrays.sort(digits, index, digits.length);

			System.out.println("Next Greater Number: " + Arrays.toString(digits));
		}
	}
}
