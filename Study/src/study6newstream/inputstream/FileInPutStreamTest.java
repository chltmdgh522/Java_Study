package study6newstream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInPutStreamTest {
    public static void main(String[] args) {

        FileInputStream fis=null;
        int i=0;
        try{
            fis=new FileInputStream("input.txt");
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
        }catch(IOException e){
            System.out.println(e);
        }finally {
            try{
                fis.close();
            }catch(IOException e){
                System.out.println(e);
            }catch(NullPointerException e){
                System.out.println(e);
            }
        }

    }
}
