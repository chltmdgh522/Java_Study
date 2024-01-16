package question;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q2File {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (FileWriter fw = new FileWriter("file.txt")) {
            String str = sc.next();
            fw.write(str);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (InputStreamReader irs = new InputStreamReader(new FileInputStream("file.txt"))) {
            int i;
            StringBuilder b = new StringBuilder();
            StringBuilder c = new StringBuilder();
            while ((i = irs.read()) != -1) {
                System.out.print((char) i);
                b.append(String.valueOf((char) i));
            }
            for (int j = b.length(); j > 0; j--) {
                c.append(b.charAt(j - 1));
            }
            if (b.toString().equals(c.toString())) {
                System.out.println("화문수맞음");
            } else {
                System.out.println("틀림");
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
