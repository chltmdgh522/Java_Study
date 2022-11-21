package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getInstance(); // 저 매서드를 불러올려고 이렇게 썼다. 
		
		Company c2 = Company.getInstance();
		
		System.out.println(c1);
		System.out.println(c1);
	}
	

}
