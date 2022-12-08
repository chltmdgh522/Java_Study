import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> hs = new HashMap<>();
        hs.put("hi", "ee");
        hs.put("his", "eee");

        Iterator<String> ir=hs.keySet().iterator();
        while(ir.hasNext()){
            String key= ir.next();
            String a = hs.get(key);
            System.out.println(key+a);
        }



        System.out.println(hs);



        System.out.println("Hello world!");
    }
}