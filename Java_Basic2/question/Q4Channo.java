package question;

import java.util.Scanner;

public class Q4Channo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력:");
        String str = sc.next();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                cnt++;
            }
        }

        System.out.printf("a의 갯수" + cnt);


    }
}
