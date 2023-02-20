package test0;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test3 {
    public static void main(String[] args) {
        String[] num = {"1", "2", "3", "1"};
        Map<String, Integer> hashMap = new HashMap<>();

        for (String key : num) {
            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
        }

        for(Map.Entry<String,Integer> entrySet: hashMap.entrySet()){
            System.out.println(entrySet.getKey());
        }
        test4 t4=new test4();

        System.out.println(t4);



        /*
        결과값:
        1:2
        2:1
        3:1
        */
    }
}
