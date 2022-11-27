package study3queuestack;

import java.util.ArrayList;

class MyQueue {
    ArrayList<String> list = new ArrayList<>();

    public void enQue(String data) {
        list.add(data);
    }

    public void deQue() {
        if (list.size()==0){
            System.out.println("없다");
        }
        else System.out.println(list.remove(0));


    }

}


public class QueueTest {
    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();
        myQueue.enQue("a");
        myQueue.enQue("b");
        myQueue.enQue("c");
        myQueue.deQue();
        myQueue.deQue();
        myQueue.deQue();


    }

}
