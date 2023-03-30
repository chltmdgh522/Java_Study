package test0;

import jdk.jshell.JShell;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class test5 {
    public static void main(String[] args) {
        int[] data=new int[5];
        data= new int[]{1, 2, 3, 4, 5};
        data= new int[]{1,2,3};
//c언어는 저거 오류남
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        Stack<Integer> stack= new Stack<>();
        stack.push(-1);
        System.out.println(stack.get(0));
     }
}
