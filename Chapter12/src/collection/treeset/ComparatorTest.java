package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		
		return str1.compareTo(str2)*(-1);
	}
}
public class ComparatorTest {
	public static void main(String[] args) {
	TreeSet<String> tree=new TreeSet<String>(new MyCompare());
		
		tree.add("최");
		tree.add("승");
		tree.add("호");
		tree.add("호");	
		System.out.println(tree);
	}
}