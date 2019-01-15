//Find the sum of digits of a given integer
//Developed By: Rayhan Hossain (Mukla.C) on 2019/01/15

class DigitSum{
	public static void main(String[] args){
		int n = 10;

		int sum = 0;
		while(n != 0){
			int mod = n % 10;
			sum += mod;
			n = n/10;
		}
		System.out.println("Some of digits: " + sum);
	}
}
