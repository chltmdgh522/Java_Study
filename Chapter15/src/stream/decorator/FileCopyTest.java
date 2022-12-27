package stream.decorator;

import java.io.*;

public class FileCopyTest {
    public static void main(String[] args) {
        long milliseconds=0;
        int len=0;

        try(FileInputStream fis =new FileInputStream("a.exe");
        FileOutputStream fos= new FileOutputStream("b.exe");
            BufferedInputStream bis= new BufferedInputStream(fis);
            BufferedOutputStream bos= new BufferedOutputStream(fos); //빨리 실행시켜주는거
        ){
            milliseconds=System.currentTimeMillis();
            int i;
            while((i=bis.read())==-1){
                bos.write(i);
                len++;
            }
            milliseconds=System.currentTimeMillis();
        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println(len);
        System.out.println(milliseconds);
    }
}
