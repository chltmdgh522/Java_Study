package stream;

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
        String[] greetings = {"승호는 귀여웡", "인정한다.", "ddddddddddddddddddddddddddd"};

        //getByte() -> 바이트코드로 인코딩해주는거

        System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
                    if (s1.getBytes().length >= s2.getBytes().length)
                        return s1;
                    else return s2;
                }

        ));

        String s = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(s);


    }
}

