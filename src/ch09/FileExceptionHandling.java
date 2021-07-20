package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		FileInputStream fls = null;
		
		try {
			fls = new FileInputStream("a.txt");
			System.out.println("read");
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
			
		}finally {
			if(fls !=null) {
				try {
					fls.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("finally - Ç×»ó ½ÇÇàµÊ");
		}
		System.out.println("end");
	}

}
