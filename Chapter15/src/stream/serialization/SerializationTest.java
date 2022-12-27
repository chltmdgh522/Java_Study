package stream.serialization;

import java.io.*;

class Person implements Serializable { // 직렬화는 객체의 정보저장 즉 객체를 유출 시키기위해 쓴다?

    String name;
    String title;
    // transient title - 직렬화할때 얘는 멤버변수를 저장하지 않겠다.
    public Person(){}
    public Person(String name, String title){
        this.name=name;
        this.title=title;
    }

    @Override
    public String toString() {
        return name+","+title;
    }
}
public class SerializationTest {
    public static void main(String[] args) throws FileNotFoundException {
        Person personChoi=new Person("Choi","Manager");
        try(FileOutputStream fos= new FileOutputStream("serial.dat");
            ObjectOutputStream oos= new ObjectOutputStream(fos)){
            oos.writeObject(personChoi);
        }catch(IOException e){
            System.out.println(e);
        }
        try(FileInputStream fis = new FileInputStream("serial.dat");
        ObjectInputStream ois=new ObjectInputStream(fis)){
            Object obj=ois.readObject();
            if(obj instanceof Person) {
                Person p=(Person)obj;
                System.out.println(p);
            }
        }catch (IOException e){
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
