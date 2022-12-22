package collection.arraylist;

import java.util.ArrayList;

class MyQueue {

    ArrayList<String> queueList = new ArrayList<String>();

    public void enque(String data) {
        queueList.add(data);
    }

    public String deque() {
        int len = queueList.size();
        if (len == 0) {
            return null;
        }

        return queueList.remove(0);
    }


}


public class QueueTest {

    public static void main(String[] args) {
        MyQueue myq = new MyQueue();

        myq.enque("최");
        myq.enque("승");
        myq.enque("호");
        System.out.println(myq.deque());


    }

}
