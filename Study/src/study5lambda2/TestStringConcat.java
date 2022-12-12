package study5lambda2;

public class TestStringConcat {
    public static void main(String[] args) {
        StringConcat a= (s1, s2) -> System.out.println(s1+ " "+ s2);
        a.makeString("승호는","천하통일을 이룬자다.");

        StringConcat a1 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1+""+s2);
            }

        };
        a1.makeString("승호는","성공했다.");

    }
}
