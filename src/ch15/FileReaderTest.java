package ch15;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		try(FileReader fls = new FileReader("reader.txt")){
			int i;
			
			while((i = fls.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			
		}
	}

}
