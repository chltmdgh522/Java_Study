package array;

public class ArrayTest2 {

    public static void main(String[] args) {
        double[] nume = new double[3];

        int size = 0;
        nume[0] = 10.0;
        size++;
        nume[1] = 20.0;
        size++;
        nume[2] = 30.0;
        size++;
        double total = 1;
        for (int i = 0; i < size; i++) {
            System.out.println(nume[i]);
            total *= nume[i];

        }
        System.out.println(total);

    }

}
