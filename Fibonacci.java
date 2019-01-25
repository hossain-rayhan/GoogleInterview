//Find the nth Fibonacci number
//Developed By: Rayhan Hossain (Mukla.C) on 2019/01/15
//Without memoization Time Complexity: slight less than O(2^N)
//With Memoization Time Complexity: almost O(N)- Linear

import java.util.Scanner;

class Fibonacci{
	public static int[] memo = new int[100];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		
		System.out.println("Nth Fibonacci: " + fibo(n));
		System.out.println("Nth Fibonacci Memo: " + fiboMemoization(n));
		System.out.println("Nth Fibonacci Without DP: " + fiboWithoutDp(n));
	}

	public static int fibo(int n){
		return n <= 1? n : fibo(n-1) + fibo(n-2);
	}

	public static int fiboMemoization(int n){
		if(n <= 1)
			return n;
		if(memo[n] < 1){
			memo[n] = fiboMemoization(n-1) + fiboMemoization(n-2);
		}
		return memo[n];
	}

	//We can also solve this without Dynamic Programming
	//We just can use some extra variables
	//Though it looks simple in this case, but dynamic programming makes life easier in many cases
	//Time Complexity would be: O(N) -Linear
	
	public static int fiboWithoutDp(int n){
		if(n == 0 || n == 1)
			return n;

		int a = 0, b = 1, c = 0;

		for(int i = 2; i <= n; i++){
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
}
