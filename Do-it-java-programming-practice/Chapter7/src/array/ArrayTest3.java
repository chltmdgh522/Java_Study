package array;

public class ArrayTest3 {

    public static void main(String[] args) {

        char[] alphabets = new char[26];

        char word = 'A';

        for (int i = 0; i < alphabets.length; i++) {

            alphabets[i] = word;
            word++;
            System.out.println(alphabets[i]);
        }


    }

}
 