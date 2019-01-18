import java.util.Arrays;

class PowerSet{
	public static void main(String[] args){
		String[] set = {"A", "B", "C"};
		System.out.println(Arrays.toString(getPowerSet(set)));
	}

	public static String[] getPowerSet(String[] set){
		String[] powerSet = new String[(int) Math.pow(2, set.length)];

		for(int i = 0; i < powerSet.length; i++){
			int[] binary = new int[set.length];
			decimalToBinary(i, binary);

			String result = "";
			for(int j = 0; j < binary.length; j++){
				if(binary[j] == 1){
					result = result + set[j];
				}
			}
			powerSet[i] = result;
		}
		return powerSet;
	}

	public static void decimalToBinary(int decimal, int[] binary){
		int index = binary.length - 1;
		while(decimal != 0){
			int modulus = decimal % 2;
			binary[index--] = modulus;
			decimal = decimal / 2;
		}
	}

}
