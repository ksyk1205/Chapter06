package ch05;

public class PrintStringTest {

	public static void main(String[] args) {
		PrintString lambdaStr = s->System.out.println(s);  //���ٽ��� ������ ����
		lambdaStr.showString("hello lambda_1");


	}

}
