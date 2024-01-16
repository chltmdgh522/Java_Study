package test0;

import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class test1 {
    public static void main(String[] args) {
        String s="010-3371-5386";
        String[] sp=s.split("-",2); // -를 기준으로 문자를 나누고 크기를 2로 고정
        for(int i=0; i<sp.length; i++){ // 크기는 2가 됨
            System.out.println(sp[i]); // -를 기준으로 2로 나눠서 010 과 3371-5386이 출력
        }

        s=s.substring(0);
        System.out.println(s);

        Stack stack = new Stack<>();
        stack.add(1);
        stack.push("d");
        System.out.println(stack);


        TreeSet hashSet= new TreeSet<>();
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(2);
        System.out.println(hashSet);
    }
}
