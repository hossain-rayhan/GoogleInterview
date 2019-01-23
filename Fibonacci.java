//Find the nth Fibonacci number
//Developed By: Rayhan Hossain (Mukla.C) on 2019/01/15
//Without memoization Time Complexity: O(2^N)
//With Memoization Time Complexity: O(N)- Linear

import java.util.Scanner;

class Fibonacci{
	public static int[] memo = new int[100];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		
		System.out.println("Nth Fibonacci: " + fibo(n));
		System.out.println("Nth Fibonacci Memo: " + fiboMemoization(n));

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
}
