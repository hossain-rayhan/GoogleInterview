// LeetCode-08: String to Intefer (atoi)

import java.util.Scanner;

class StringToInteger{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to convert:");
		String input = sc.nextLine();
		sc.close();

		System.out.println("Integer: " + atoi(input));
	}

	public static int atoi(String str){
		boolean firstDigitFound = false, initialValidCharFound = false;
		long signValue = 1;
		int index = 0;
		String numString = "";

		while(index < str.length()){
			char ch = str.charAt(index);

			if(ch > 48 && ch <= 57){
				numString = numString + ch;
				firstDigitFound = true;
			}else if(ch == '0'){
				if(firstDigitFound){
					numString = numString + ch;
				}else{
					initialValidCharFound = true;
				}
			}else if(ch == '+'){
				if(firstDigitFound){
					break;
				}else{
					if(initialValidCharFound)
						return 0;
					signValue = 1;
					initialValidCharFound = true;
				}
			}else if(ch == '-'){
				if(firstDigitFound){
					break;
				}else{
					if(initialValidCharFound)
						return 0;
					signValue = -1;
					initialValidCharFound = true;
				}
			}else if(ch == ' '){
				if(firstDigitFound){
					break;
				}else if(initialValidCharFound){
					return 0;
				}else{
					//do nothing
				}
			}else{
				if(firstDigitFound){
					break;
				}else{
					return 0;
				}
			}

			index++;
		}
		
		if(numString.length() == 0)
			return 0;
		long longNum = 0;
		if(numString.length() > 11){
			longNum = Long.parseLong(numString.substring(0, 11));
		}else{
			longNum = Long.parseLong(numString);
		}
		longNum = longNum * signValue;
		if(longNum < -2147483648)
			longNum = -2147483648;
		if(longNum > 2147483647)
			longNum = 2147483647;

		return (int)longNum;
	}
}
