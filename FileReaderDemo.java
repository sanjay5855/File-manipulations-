import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fileReader = new FileReader("cricket.txt");
		int i = fileReader.read();
		while (i != -1) {
			System.out.println((char) i);
			i = fileReader.read();
		}
		System.out.println("----------------------------");
		File file = new File("demo.txt");
		file.createNewFile();
		FileWriter fileWriter = new FileWriter("demo.txt");
		//fileWriter.write(410);
		fileWriter.write("Altencalsoft/software/solution");
		fileWriter.flush();
		
		FileReader fileReader2 = new FileReader("demo.txt");
		int j = fileReader2.read();
		while (j != -1) {
			System.out.println((char) j);
			j = fileReader2.read();

		}
		fileWriter.close();
	}

}
