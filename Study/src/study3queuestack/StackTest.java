package study3queuestack;

import java.util.ArrayList;

class MyStack {
    ArrayList<String> list = new ArrayList<>();

    public void push(String data) {
        list.add(data);
    }

    public void pop() {
        if (list.size() == 0) {
            System.out.println("없다.");
        }
        System.out.println(list.remove(list.size() - 1));
    }

    public void peek() {
        if (list.size() == 0) {
            System.out.println("없다.");
        }
        System.out.println(list.get(list.size() - 1));
    }
}


public class StackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("a");
        myStack.push("b");
        myStack.push("c");
        myStack.peek();
        myStack.pop();
    }
}
