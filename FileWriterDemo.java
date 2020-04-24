import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       FileWriter fileWriter=new FileWriter("cricket.txt",true);
       char cbuf[]= {'a','g'};
        fileWriter.write(99);
        fileWriter.write("\n");
        fileWriter.write(cbuf);
        fileWriter.write("\n");
        fileWriter.write("Sanjay");
        fileWriter.write("Alten/nsoftware solution");
        //System.out.println("h");
        fileWriter.flush();
        fileWriter.close();
	}

}
