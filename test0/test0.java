package test0;

import java.util.HashMap;
import java.util.Iterator;

public class test0 {
    public static void main(String[] args) {
        test1 t=new test1();
        System.out.println(t);

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("최승호", 1);
        hashMap.put("홍세현", 2);
        hashMap.put("송동화", 3);

        Iterator<String> ir=hashMap.keySet().iterator();
        while(ir.hasNext()){
            String key=ir.next();
            System.out.println(key);
        }

        String answer="...ab.c";
        String[] sp= answer.split(".");
        for(int i=0; i<sp.length; i++)
            System.out.println(sp[i]);


    }
}
