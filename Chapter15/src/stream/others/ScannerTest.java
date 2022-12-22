package stream.others;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String name=s.nextLine();
        int num=s.nextInt();
        System.out.println(name+num);
    }
}
