package lambda;

import java.sql.SQLOutput;

public class TestStringConcat {

    public static void main(String[] args) {
        StringConcatImpl s = new StringConcatImpl();
        s.makeString("a", "b"); //1. 인터페이스

        StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2); //변수처럼 쓰는거
        concat.makeString("c", "b"); //2. 람다식

        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1+" "+s2);

            }
        };

        concat2.makeString("a","b"); //3. 익명내부클래스

    }
}
