package ch16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		try(InputStreamReader irs = new InputStreamReader(new FileInputStream("reader.txt"))){
			int i;
			while((i = irs.read()) != -1) { //보조 스트림으로 읽습니다.
				System.out.print((char)i);
			}
		} catch(IOException e) {
			System.out.println(e);
		}

	}

}