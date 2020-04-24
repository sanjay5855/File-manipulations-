import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("software.txt");
       PrintWriter pw=new PrintWriter(fw);
       pw.write(100);
       pw.println(100);
       pw.println(true);
       pw.println('c');
       pw.println("sanjay");
       pw.flush();
       pw.close();
       
       
	}

}
