package array;

public class ArrayTest {

    public static void main(String[] args) {

        int[] numbers = new int[10]; // 선언
        int[] numbers1 = new int[]{0, 1, 2}; // 꺽새안에다숫자X
        int[] numbers2 = {1, 2, 3};// 따로할때는 안됨

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;


        for (int a : numbers) {
            System.out.println(a);

        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }

}
