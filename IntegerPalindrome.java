//LeetCode-009: Palindrome Number
//First Reverse the integer, then check whether they are same

class IntegerPalindrome {
    public static void main(String[] args){
    	int x = -121;
	System.out.println(x + " is Palindrome? " + isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        
        //reverse the integer, and check whether they are same
        //Leetcode-007: Reverse an Integer
        int result = 0, original = x;
        while(x != 0){
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if((newResult - tail)/10 != result){
                //int overflow...
                return false;
            }
            x = x / 10;
            result = newResult;
	    System.out.println(result);
        }
        return result == original? true : false;
    }
}
