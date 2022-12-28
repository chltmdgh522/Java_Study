package question;

import java.util.HashMap;
import java.util.Scanner;

public class Q1HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("최승호", 1);
        hashMap.put("홍세현", 2);
        hashMap.put("송동화", 3);

        Scanner s = new Scanner(System.in);
        System.out.print("아이디");
        String name = s.next();
        System.out.print("비번");
        int num = s.nextInt();

        if (hashMap.containsKey(name) == false) {
            System.out.println("아이디 잘못");
        } else {
            if (hashMap.get(name) != num) {
                System.out.println("비번 잘못");
            } else {
                System.out.println("성공");
            }
        }

    }
}
