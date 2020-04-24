import java.io.File;

public class FileDirectroryDemo {

	public static void main(String[] args) {
		// display file name and number of file available in a directory
		int count=0;
		File file=new File("C:\\Users\\abhishek\\Documents\\workspace-spring-tool-suite-4-4.6.0.RELEASE/FileIODemo");
		String[] s=file.list();
		for(String s1:s) {
		count++;
		System.out.println(s1);
		}
		System.out.println(count);
//display only file name
		int count1=0;
		File file2=new File("C:\\Users\\abhishek\\Documents\\workspace-spring-tool-suite-4-4.6.0.RELEASE/FileIODemo");
		String string[]=file2.list();
		for(String string2:string) {
		File file3=new File(file2,string2);
		if(file3.isFile()) {
			count1++;
			System.out.println(string2);
		}
		}
		System.out.println(count1);
//display only directory name
		int count2=0;
		File file3=new File("C:\\\\Users\\\\abhishek\\\\Documents\\\\workspace-spring-tool-suite-4-4.6.0.RELEASE/FileIODemo");
		
		String string2[]=file3.list();
		for(String string3:string2) {
			File file4=new File(file3,string3);
			if(file4.isDirectory()) {
				count2++;
				System.out.println(string3);
			}
		}
		System.out.println(count2);

		

	}
	
	

}
