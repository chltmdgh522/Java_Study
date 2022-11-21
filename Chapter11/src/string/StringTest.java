package string;

public class StringTest {

	public static void main(String[] args) {
		
		String str1= new String("abc");
		String str2= new String("def");
		System.out.println(System.identityHashCode(str1));
		
		str1=str1.concat(str2); //새로생성된 문자열 가르킴 
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
		
		

	}

}
