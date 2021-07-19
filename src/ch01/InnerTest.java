package ch01;

class OutClass{
	private int num =10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();// ���� Ŭ���� ����
	}
	
	class InClass{
		int iNum = 100;
		//static int sInNum = 200;  //���� ��
		void inTest() {
			System.out.println("OutClass num ="+num+"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum ="+sNum+"(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass inNum ="+iNum+"(���� Ŭ������ �ν��Ͻ� ����)");
		}
	}
	public void usingClass() {
		inClass.inTest();//���� Ŭ���� ������ ����Ͽ� �޼��� ȣ���ϱ�
	}
	static  class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() { //���� Ŭ������ �Ϲ� �޼���
			System.out.println("OutClass num ="+iNum+"(���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum ="+sNum+"(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass inNum ="+sInNum+"(���� Ŭ������ ����ƽ ����)");
		}
		static void sTest() { // ���� Ŭ������ static �޼���
			System.out.println("OutClass sNum ="+sNum+"(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass inNum ="+sInNum+"(���� Ŭ������ ����ƽ ����)");
		}
	}
}
public class InnerTest {

	public static void main(String[] args) {
//		OutClass outClass = new OutClass();
//		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
//		outClass.usingClass();    // ���� Ŭ���� ��� ȣ��
//	    System.out.println();
//	    
//		OutClass.InClass inClass = outClass.new InClass();   // �ܺ� Ŭ������ �̿��Ͽ� ���� Ŭ���� ����
//		System.out.println("�ܺ� Ŭ���� ������ �̿��Ͽ� ���� Ŭ���� ����");
//		inClass.inTest();
		
		//�ܺ� Ŭ���� �������� �ʰ� �ٷ� ���� ���� Ŭ���� ����
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		
		System.out.println("���� ���� Ŭ������ ����ƽ �޼ҵ� ȣ��");
		OutClass.InStaticClass.sTest();

			
			
	}

}
