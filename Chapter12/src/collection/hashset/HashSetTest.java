package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		
		set.add("최승호");
		set.add("김용현");
		set.add("문홍욱");
		set.add("문홍욱");
		
		System.out.println(set);
	}
	

}