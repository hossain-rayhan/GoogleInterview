class PrimeSieve{
	public static void main(String[] args){
		primeSieve(100000);
	}

	public static void primeSieve(int n){
		boolean[] isPrime = new boolean[n+1];

		isPrime[0] = isPrime[1] = false;
		for(int i = 2; i <= n; i++){
			isPrime[i] = true;
		}

		for(int factor = 2; factor*factor <= n; factor++){
			if(isPrime[factor]){
				for(int j = factor; j * factor <= n; j++){
					isPrime[j*factor] = false;
				}
			}
		}
		for(int i = 1; i <= n; i++){
			if(isPrime[i]){
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
