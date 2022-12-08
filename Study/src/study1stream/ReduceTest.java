package study1stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {
    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length <= s2.getBytes().length) {
            return s1;
        } else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String[] names = {"위화도 회군", "살수대첩", "인천 상륙 작전"};
        //1
        Arrays.stream(names).sorted().forEach(s -> System.out.println(s));

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



