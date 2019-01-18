class BinaryToDecimal{
	public static void main(String[] args){
		int binary = 1000;
		System.out.println("Binary: " + binary + "; Decimal: "+ binaryToDecimal(binary));
	}
	public static int binaryToDecimal(int binary){
		int decimal = 0, position = 1;

		while(binary != 0){
			int digit = binary % 10;
			decimal += (position*digit);

			binary = binary / 10;
			position = position * 2;
		}
		return decimal;
	}
}
