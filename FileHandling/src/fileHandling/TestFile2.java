package fileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile2 {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\User\\Desktop\\second.txt");
		fw.write("Hello Java");
		fw.close();
		
		FileReader fr = new FileReader("C:\\Users\\User\\Desktop\\second.txt");
		
		int i=0;
		
		while((i=fr.read()) != -1)
		{
			System.out.println((char)i);
		}
	}
}
