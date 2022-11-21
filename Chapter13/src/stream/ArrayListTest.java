package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args) {

        List<String> sList = new ArrayList<String>();
        sList.add("최승호");
        sList.add("이민수");
        sList.add("김경진");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s)); //하나씩 돌리는거

        sList.stream().sorted().forEach(s -> System.out.println(s)); // 정렬되는거


        /*for (String a : sList) {
            System.out.println(a);
        }*/


        System.out.println(sList);
    }
}
