package generics;

public class Test {

	public static void main(String[] args) {
		
		ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();
		
		printer.setMaterial(new Powder());
		
		Powder powder=printer.getMaterial();
		
		System.out.println(printer);

	}

}
