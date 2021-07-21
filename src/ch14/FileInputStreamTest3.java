package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		int i;
		try(FileInputStream fls = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];
			while((i = fls.read(bs)) != -1) {
//				for(int ch:bs) { //버퍼에 남아있는 알파벳까지 출력됨
//					System.out.print((char)ch);
//				}
				for(int j=0; j<i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : "+i+ "바이트 읽음");
			}
		} catch(IOException e) {
			System.out.println(e);
		}

	}

}
