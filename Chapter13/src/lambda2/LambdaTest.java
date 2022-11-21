package lambda2;

interface PrintString {
    void showString(String str);
}
public class LambdaTest {

    public static void main(String[] args) {

        PrintString lambdaPrint = str -> {
            System.out.println(str);
        };
        lambdaPrint.showString("a");

        showMyString(lambdaPrint);

        PrintString reStr=returnPrint(); //변수로 반환받기
        reStr.showString("a"); // 메서드 호출

    }

    public static void showMyString(PrintString lambdaPrint) {

        lambdaPrint.showString("test2");
    }//매개변수

    public static PrintString returnPrint(){
        return s->System.out.println(s+"world");
    }//반환값

}
