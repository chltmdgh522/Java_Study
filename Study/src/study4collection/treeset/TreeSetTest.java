package study4collection.treeset;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("c");
        treeSet.add("b");
        treeSet.add("a");
        System.out.println(treeSet);


    }
}
