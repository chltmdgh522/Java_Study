package study2lambda;

interface PrintString {
    void show(String str);
}

public class LambdaTest {
    public static void main(String[] args) {
        PrintString a1 = (s1 -> System.out.println("승호의 성은?" + " " + s1));
        //1 람다식 생성자(기본)
        a1.show("최");
        //2 스태틱으로 함수로 해서 받아주기
        new1(a1);
        //3 변수로 반환받기(a1)
        PrintString a2 = a3(); //a1
        a2.show("박");//메서드 호출

        //4.익명내부클래스
        PrintString a4 = new PrintString() {
            @Override
            public void show(String str) {
                System.out.println("승호의 성은? " + str);
            }
        };
        a4.show("정");
    }

    public static void new1(PrintString a1) {
        a1.show("김");
    }

    public static PrintString a3() {
        return s -> System.out.println("승호의 성은?" + " " + s);
    }


}
