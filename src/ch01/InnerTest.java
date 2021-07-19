package ch01;

class OutClass{
	private int num =10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();// 내부 클래스 생성
	}
	
	class InClass{
		int iNum = 100;
		//static int sInNum = 200;  //에러 남
		void inTest() {
			System.out.println("OutClass num ="+num+"(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum ="+sNum+"(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum ="+iNum+"(내부 클래스의 인스턴스 변수)");
		}
	}
	public void usingClass() {
		inClass.inTest();//내부 클래스 변수를 사용하여 메서드 호출하기
	}
	static  class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() { //정적 클래스의 일반 메서드
			System.out.println("OutClass num ="+iNum+"(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum ="+sNum+"(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum ="+sInNum+"(내부 클래스의 스태틱 변수)");
		}
		static void sTest() { // 정적 클래스의 static 메서드
			System.out.println("OutClass sNum ="+sNum+"(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum ="+sInNum+"(내부 클래스의 스태틱 변수)");
		}
	}
}
public class InnerTest {

	public static void main(String[] args) {
//		OutClass outClass = new OutClass();
//		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
//		outClass.usingClass();    // 내부 클래스 기능 호출
//	    System.out.println();
//	    
//		OutClass.InClass inClass = outClass.new InClass();   // 외부 클래스를 이용하여 내부 클래스 생성
//		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
//		inClass.inTest();
		
		//외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		
		System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
		OutClass.InStaticClass.sTest();

			
			
	}

}
