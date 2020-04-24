import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("cricket.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println("------------------------");
		
		File file=new File("crcket123");
		System.out.println(file.exists());
		file.mkdir();
		System.out.println(file.exists());
		
		System.out.println("------------------------");
        File file2=new File("Saicharan123");
        file2.mkdir();
        File file3=new File("Saicharan123","abc.txt");
        file3.createNewFile();

	}

}
