class LongestCommonSubsequence{
	public static void main(String[] args){
		char[] a = {'a', 'e', 'c', 'a'};
		char[] b = {'e', 'k', 'd', 'c', 'a'};

		lcs(a, b);
	}

	public static void lcs(char[] a, char[] b){
		int[][] matrix = new int[a.length + 1][b.length + 1];

		for(int i = 1; i <= a.length; i++){
			for(int j = 1; j <= b.length; j++){
				//if both of the chars are same, diagonal plus one
				if(a[i-1] == b[j-1]){
					matrix[i][j] = matrix[i-1][j-1] + 1;
				}else{
					// if the chars do not match, max of(left, top)
					matrix[i][j] = Math.max(matrix[i][j-1], matrix[i-1][j]);
				}
			}
		}
		System.out.println("Length of Longest Common Subsequence: " + matrix[a.length][b.length]);
	}

}
