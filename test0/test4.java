package test0;

import java.util.Stack;

public class test4 {
    public static void main(String[] args) {
        Stack s=new Stack<>();
        s.add("1");
        s.add("2");
        s.add("3");
        s.remove(2);
        System.out.println(s.get(1));
    }



}
