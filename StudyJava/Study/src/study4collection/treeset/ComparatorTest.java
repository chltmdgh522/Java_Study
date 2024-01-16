package study4collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2) * (-1);
    }
}

public class ComparatorTest {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new MyCompare());
        treeSet.add("최승호");
        treeSet.add("김승호");
        treeSet.add("박승호");
        for (String a : treeSet) {
            System.out.println(a);
        }
        System.out.println(treeSet);

    }
}
