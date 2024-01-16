package stream.inputstream;

import java.io.IOException;

public class SystemInTest {
    public static void main(String[] args) throws IOException {
        System.out.println("알파벳 하나를 쓰고 엔터를 누르세요.");
        int i=0;
        while((i=System.in.read())!='\n'){
            System.out.println((char)i);
        }

    }
}
