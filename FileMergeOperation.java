import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMergeOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("file3.txt");
		PrintWriter pw1 = new PrintWriter("file1.txt");
		PrintWriter pw2 = new PrintWriter("file2.txt");
		pw1.println("aaa");
		pw1.println("bbb");
		pw1.println("ccc");
		pw2.println(666);
		pw2.println(777);
		pw2.println(888);
		pw1.flush();
		pw2.flush();
		pw1.close();
		pw2.close();
		BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
		String line = br.readLine();
		while (line != null) {
			pw.println(line);
			System.out.println(line);
			line = br.readLine();
		}
		br = new BufferedReader(new FileReader("file2.txt"));
		line = br.readLine();
		while (line != null) {
			System.out.println(line);
			pw.println(line);
			line = br.readLine();

		}
		System.out.println("---------------------------------------");
		pw.println("--------alternate merging fron different 2 file---------------------------------");
		BufferedReader bufferedReader = new BufferedReader(new FileReader("file1.txt"));
		BufferedReader bufferedReader2 = new BufferedReader(new FileReader("file2.txt"));
		String string = bufferedReader.readLine();
		String string2 = bufferedReader2.readLine();
		while (string != null || string2 != null) {
			if (string != null) {
				System.out.println(string);
				pw.println(string);
				string = bufferedReader.readLine();
			}
			if(string2!=null) {
				System.out.println(string2);
				pw.println(string2);
				string2=bufferedReader2.readLine();
			}

		}
		pw.flush();
		pw.close();

	}

}
