package study1stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {
    @Override
    public String apply(String s, String s2) {
        if (s.getBytes().length >= s2.getBytes().length) {
            return s2;
        } else return s;
    }

}

public class ReduceTest {
    public static void main(String[] args) {

        String[] names = {"고려", "대한민국", "고구려"};
        //1
        Arrays.stream(names).sorted().forEach(s -> System.out.print(s));
        System.out.println();

        //2
        System.out.println(Arrays.stream(names).reduce("", ((s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length) {
                return s1;
            } else return s2;
        }
        )));

        //3
        System.out.println(Arrays.stream(names).reduce(new CompareString()).get());

    }

}



