package stream.writer;

import stream.outputstream.FileOutputStreamTest;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("writer.txt")) {
            fw.write("A");
            char[] ch = {'a', 'b', 'c'};
            fw.write(ch);
            fw.write("승호의 귀여움");
            fw.write(ch, 1, 2);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
