package innerclass;

class OutClass{
	
	int num=10;
	static int sNum=20;
	InClass inClass;
	public OutClass(){
		inClass=new InClass();	
	}
	class InClass{
		int snum=20;
		static int sInNum=100; //? 강의에서는 안된다 했는데 원래 안되는게 맞긴함 왜냐하면 스태틱은 인스턴스 생성과 관계없이 되는데 애같은 경우는 내부클래스안이라서 인스턴스... 흠 모르겠다.
		void inTest() {
			System.out.println(num);
		}
		static void sTest() {
		}
	}//인스턴스 내부 클래스 
	
	public void show() {
		inClass.inTest();
		
	}
	static class InStaticClass{
		int iNum=100;
		static int sInNum =200;
		void inTest() {
			//num+=10;
			sNum+=10;
			System.out.println(sNum);
		}
		static void insTest() {
			System.out.println("d");
			
		}
	}
}
public class InnerTest{

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.show();
		OutClass.InStaticClass sInClass =new OutClass.InStaticClass();
		sInClass.inTest();
		OutClass.InStaticClass.insTest();
	}
}
