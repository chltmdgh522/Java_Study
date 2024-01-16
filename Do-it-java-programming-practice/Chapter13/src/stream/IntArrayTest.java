package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        /*IntStream stream=Arrays.stream(arr);
        int a1=stream.sum();*/
        int a1 = Arrays.stream(arr).sum();
        int a2= (int)Arrays.stream(arr).count(); //count 메서드 반환값이 long 이므로 int 형으로 전환

//한번 끝나면 소모 된대...

        System.out.println(a2);
    }
}
