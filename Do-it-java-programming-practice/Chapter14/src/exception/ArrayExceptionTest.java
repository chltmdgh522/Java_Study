package exception;

public class ArrayExceptionTest {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        try { // 예외를 처리하길 원하는 실행 코드
            for (int i = 0; i <6  ; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){//e
            System.out.println(e); //e 예외가 발생할 경우 실행 될 코드
            return; //finally 구문다음에 return이 출력 end는 출력안됨
        } finally {//try가 수행되면 무조건 수행됨 , 맨마직막에 정리하는 구문
            System.out.println("finally");
        }
        System.out.println("end");
    }
}
