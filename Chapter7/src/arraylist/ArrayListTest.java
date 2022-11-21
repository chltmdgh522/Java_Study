package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		
		//ArrayList에서 스트링 타입을 가져다 쓰겠다.
		list.add("aaa");
		list.add("aaa");
		list.add("aaa");
		
		for(String s : list) {
			System.out.println(s);
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println("아아아");
		}

	}

}
