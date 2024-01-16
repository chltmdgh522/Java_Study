package exception;

import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        try{
            int num=s.nextInt();
            System.out.println(num);
        }catch(Exception e){
            System.out.println("정수만 출력 가능");
        }
    }
}
