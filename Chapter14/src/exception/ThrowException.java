package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {
    Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        // throw 는 exception 강제로 발생시킬때 사용 throws 는 미룸
        ThrowException te = new ThrowException();
        try {
            te.loadClass("a.txt", "asd");
        } catch (FileNotFoundException a) {
            System.out.println(a);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

    }
}
