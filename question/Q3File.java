package question;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3File {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("test.txt"))) {
            int i, j = 0, k = 0;
            while ((i = isr.read()) != -1) {
                if (i >= 65 && i <= 90) {
                    j++;
                } else if (i >= 97 && i <= 122) {
                    k++;
                }
                System.out.print((char) i);

            }
            System.out.println();
            System.out.println("소문자:" + k + " " + "대문자:" + j);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
