package study4collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2) * (-1);
    }
}

public class ComparatorTest {

    public static void main(String[] args) {
        TreeSet<String> a = new TreeSet<>(new MyCompare());
        a.add("최");
        a.add("승");
        a.add("호");
        System.out.println(a);


    }
}
