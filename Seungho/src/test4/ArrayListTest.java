package test4;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("ㄱ");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	int[]a={1,2,3,4};

}
