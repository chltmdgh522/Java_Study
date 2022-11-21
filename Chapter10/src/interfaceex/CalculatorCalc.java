package interfaceex;

public class CalculatorCalc extends Calculator {

	@Override
	public int mul(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int div(int num1, int num2) {
		if(num2!=0) {
		return num1/num2;
	}
		else {
			return ERROR;
		}

	}
	
	public void show() {
		System.out.println("Calc 인터페이스를 구현합니다.");
		
	}
	
	
}
