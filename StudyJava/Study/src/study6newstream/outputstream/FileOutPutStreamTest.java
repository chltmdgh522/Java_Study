package study6newstream.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest {
    public static void main(String[] args) {
        byte[] bs =new byte[26];
        byte data=65;
        for(int i=0; i<bs.length; i++){
            bs[i]=data++;
        }
        try(FileOutputStream fos= new FileOutputStream("output.txt",true)){ // true는 계속 이어주는거
            fos.write(bs,2,10);
        }catch(IOException e){
            System.out.println(e);
        }

    }

}
