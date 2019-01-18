class ReverseAString{
	public static void main(String[] args){
		System.out.println("Orginal: Mukla.C, Reverse: " + reverseString("Mukla.C"));
		System.out.println("Orginal: Rayhan, Reverse: " + reverseString("Rayhan")); 
	}
	public static String reverseString(String s){
		int length = s.length();
		int lastIndex = length - 1;

		char[] arr = s.toCharArray();
		for(int i = 0; i < length/2; i++){
			char temp = arr[i];
			arr[i] = arr[lastIndex-i];
			arr[lastIndex-i] = temp;
		}
		return new String(arr);
	}
}
