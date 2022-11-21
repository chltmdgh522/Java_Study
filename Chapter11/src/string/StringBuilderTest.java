package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String str1=new String("abc");
		
		System.out.println(System.identityHashCode(str1));
		
		StringBuilder buffer=new StringBuilder(str1);
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append("def");
		buffer.append("ghi");
		
		System.out.println(System.identityHashCode(buffer));
		
		String str2=buffer.toString();
		System.out.println(str2);
		
		Integer i=new Integer(100);
		Integer a=100;


	}

}
