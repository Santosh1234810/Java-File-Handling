package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFile1 {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\User\\Desktop\\file1.doc");
		
		file.write('A');
		file.write('B');
		file.close();
		
		System.out.println("Write data in file");
	}
}
