package study1stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {
    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length <= s2.getBytes().length)
            return s1;
        else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {

        String[] names = {"조선임금은 그들을 노하였노라", "고려황제는 들어라", "임진왜란과 귀주대첩"};

        Arrays.stream(names).sorted().forEach(s -> System.out.println(s));

        System.out.println(Arrays.stream(names).reduce((""), (s1, s2) -> {
            if (s1.getBytes().length <= s2.getBytes().length)
                return s1;
            else return s2;
        }));

        System.out.println(Arrays.stream(names).reduce(new CompareString()).get());
    }


}
