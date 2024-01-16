package study5lambda2;

public class TestMyNumber {

    public static void main(String[] args) {

        MyNumber n1 = (x, y) -> x + y;
        System.out.println(n1.getMaxNumber(56,5));


        MyNumber n2= new MyNumber() {
            @Override
            public int getMaxNumber(int n1, int n2) {


                return n1+n2;
            }
        };
        System.out.println(n2.getMaxNumber(5,5));
    }


}
