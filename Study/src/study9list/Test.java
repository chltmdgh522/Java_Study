package study9list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("C");
        list.add("A");
        list.add("B");
        list.add("a");
        //[C,A,B,a]

        //오름차순 정렬
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        //[A, B, C, a]

        //내림차순 정렬
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
        //[a, C, B, A]

        //대소문자 구분없이 오름차순
        list.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(list);
        //[a, A, B, C]

        //대소문자 구분없이 내림차순
        list.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        System.out.println(list);
        //[C, B, a, A]


    }
}
