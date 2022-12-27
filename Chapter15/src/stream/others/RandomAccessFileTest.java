package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("random.txt","rw");
        rf.writeInt(1); //4
        System.out.println(rf.getFilePointer());
        rf.writeDouble(3.14);
        System.out.println(rf.getFilePointer());
        rf.writeUTF("안녕하세요"); // 3*5+2(맨뒤 널문자)
        System.out.println(rf.getFilePointer());

        rf.seek(0); //처음부터 읽어줄려고
        int i=rf.readInt();
        double b= rf.readDouble();
        String str=rf.readUTF();
        System.out.println(i+b+str);
    }
}
