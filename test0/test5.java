package test0;

import jdk.jshell.JShell;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class test5 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap=new HashMap<>();
        hashMap.put(2,"choi");
        hashMap.put(1,"chi");
        hashMap.put(1,"chi");
        for(Integer key: hashMap.keySet()){
            System.out.println(hashMap.get(key));
        }

     }
}
