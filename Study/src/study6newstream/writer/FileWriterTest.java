package study6newstream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        char[] ch={'a','b'};
        try(FileWriter fw=new FileWriter("writer.txt",true)){
            fw.write("승호는 귀여어요");
            fw.write(ch);
        }catch(IOException e){
            System.out.println(e);
        }

    }
}
