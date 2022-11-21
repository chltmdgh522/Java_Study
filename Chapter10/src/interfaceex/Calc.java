package interfaceex;

public interface Calc {
	
	double PI=3.14; // public static final 로 선언됨 
	int ERROR=-9999999; // == 
	
	default int add(int num1, int num2) {
		return num2;
	}
	int sub(int num1, int num2);
	int mul(int num1, int num2);
	int div(int num1, int num2); // 추상 메서드 public abstract
	
	default void description() {
		System.out.println("점수 계산기를 구현합니다.");
		method();
	} // 디폴트 메서드
	
	private void method() {
		System.out.println("점수 계산기를 구현합니다.1");	
	} // private 메서드. 정적메서드에서 호출가능 
	
	// private static 메서드도 있는데 이거는 static 메서드에서 구현가능
	
	static int total(int[] arr) {
		int total=0;
		
		for(int i:arr) {
			total+=i;
			
		}
		return total;
		
	}//스태틱메서드 인스턴스생성과 상관없이 인터페이스를 불러서 자체적으로 가능 

}
