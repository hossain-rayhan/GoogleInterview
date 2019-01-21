//Find sqrt of a positive integer
//Using Binary Search alogrithm concept

class Sqrt{
	public static void main(String[] args){
		int x = 16;
		System.out.println("Sqrt of " + x + " is: " + sqrt(x));
	}

	public static int sqrt(int x){
		if(x == 0)
			return 0;
		long min = 1, max = x, mid;
		while(max - min > 1){
			mid = (min + max)/2;
			System.out.println("Max: " + max + "; Min: " + min + "; Mid: " + mid);

			if(mid*mid > x){
				max = mid;
			}else{
				min = mid;
			}
		}
		return (int)min;
	}
}
