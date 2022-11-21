package interfaceex;

public class CalcTest {

	public static void main(String[] args) {
		
		int num1=10, num2=5;
		Calc calc = new CalculatorCalc();
		System.out.println( calc.add(num1, num2)
		+calc.sub(num1, num2)+
		calc.mul(num1, num2)+
		calc.div(num1, num2)
		);
		calc.description();
		
		int[]arr= {1,2,3,4,5};
		
		int sum= Calc.total(arr);
		
		System.out.println(sum);
		
		

	}

}
