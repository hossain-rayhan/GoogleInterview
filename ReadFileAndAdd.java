import java.io.FileReader;
import java.io.BufferedReader;

class ReadFileAndAdd{
	public static void main(String[] args){
		String fileName = "readFileInput.txt";
		readFileAndAdd(fileName);
	}

	public static void readFileAndAdd(String filePath){
		FileReader fileReader;
		BufferedReader bufferedReader;
		int sum = 0;

		try{
			fileReader = new FileReader(filePath);
			bufferedReader = new BufferedReader(fileReader);

			String currentLine;
			while((currentLine = bufferedReader.readLine()) != null){
				int value = Integer.parseInt(currentLine);
				sum += value;
			}
		}catch(Exception e){
			System.out.println("Please, check the file path");
		}

		System.out.println("Sum = " + sum);
	}
}
