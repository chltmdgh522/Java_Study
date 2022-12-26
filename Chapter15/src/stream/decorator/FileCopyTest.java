package stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
    public static void main(String[] args) {
        try(FileInputStream fis =new FileInputStream("a.exe");
        FileOutputStream fos= new FileOutputStream("b.exe")){

            int i;
            while((i=fis.read())==-1){
                fos.write(i);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
