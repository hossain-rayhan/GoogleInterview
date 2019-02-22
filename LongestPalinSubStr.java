//https://www.youtube.com/watch?v=HBtiDHIOK9A
//https://www.geeksforgeeks.org/longest-palindrome-substring-set-1/
//DP- Time O(N^2), we can also solve using basic loop and check O(N^3)

class LongestPalinSubStr{
	public static void main(String[] args){
		String str = "abbasfasdfcddasd";
		String palindrome = getLongestPalinSubstr(str);
		System.out.println("String = " + str + "; palin: " + palindrome);
	}

	public static String getLongestPalinSubstr(String s){
		int n = s.length();
		//isPalindrome[i][j] is true if substr[i....j] is palindrome
		boolean[][] isPalindrome = new boolean[n][n];

		//all substring of length 1 is palindrome
		int maxLength = 1;
		for(int i = 0; i < n; i++){
			isPalindrome[i][i] = true;
		}
		
		//check for substring of length 2
		int start = 0;
		for(int i = 0; i < n-1; i++){
			if(s.charAt(i) == s.charAt(i+1)){
				isPalindrome[i][i+1] = true;
				start = i;
				maxLength = 2;
			}
		}
		
		//check for length l > 2
		for(int l = 3; l <=n;  l++){
			for(int i = 0; i < n-l+1; i++){
				//get ending index of substr from i to a length of l
				int j = i + l -1;
				
				//check if substr from ith to jth is palindrome
				if(isPalindrome[i+1][j-1] && s.charAt(i) == s.charAt(j)){
					isPalindrome[i][j] = true;
					if(l > maxLength){
						start = i;
						maxLength = l;
					}
				}
			}
		}

		return s.substring(start, start + maxLength);
	}
}
