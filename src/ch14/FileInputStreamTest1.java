package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileInputStream fls = null;
		try {
			fls = new FileInputStream("input.txt");
			System.out.println((char)fls.read());
			System.out.println((char)fls.read());
			System.out.println((char)fls.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				fls.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		} finally {
			try {
				fls.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
		
	}
}
