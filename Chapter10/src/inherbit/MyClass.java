package inherbit;

public class MyClass implements MyInterface {

	@Override
	public void x() {
		System.out.println("X");
		
	}

	@Override
	public void y() {
		System.out.println("Y");
		
	}

	@Override
	public void myMethod() {
		System.out.println("mymethod");
		
	}
	
	public static void main(String[] args) {
		MyClass my=new MyClass();
		
		X x=my;
		x.x();
		my.myMethod();
		
	}

}
