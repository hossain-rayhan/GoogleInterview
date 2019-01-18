class DecimalToBinary{
	public static void main(String[] args){
		int decimal = 15;
		System.out.println("Decimal: " + decimal + "; Binary: " + decimalToBinary(decimal));
	}

	public static String decimalToBinary(int decimal){
		String binaryString = "";
		while(decimal != 0){
			int modulus = decimal % 2;
			binaryString = modulus + binaryString;
			decimal = decimal / 2;	
		}
		return binaryString;
	}
}
