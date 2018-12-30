//GCD: Greatest Common Divisor
//LCM: Least Common Multiple
//A*B = LCM(A,B) * GCD(A,B)
//Developed by Rayhan Hossain (Mukla.C) on 2018/12/29


import java.util.Arrays;

class GCD_LCM{
	public static void main(String[] args){
		int[] arr = {3, 24, 15, 12};
		System.out.println(Arrays.toString(arr));
		System.out.println("GCD: " + gcd(arr));
		System.out.println("LCM: " + lcm(arr));
	}

	public static int gcd(int a, int b){
		while(b > 0){
			int modulus = a % b;
			a = b;
			b = modulus;
		}
		return a;
	}
	public static int gcd(int[] input){
		int result = input[0];
		for(int i = 1; i < input.length; i++){
			result = gcd(result, input[i]);
		}
		return result;
	}

	public static int lcm(int a, int b){
		return (a*b) / gcd(a,b);
	}

	public static int lcm(int[] input){
		int result = input[0];
		for(int i = 1; i < input.length; i++){
			result = lcm(result, input[i]);
		}
		return result;
	}
}
