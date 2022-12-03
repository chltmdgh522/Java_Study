package test8;

public class Test {

    public static void main(String[] args) {
        HistoryTimeLine h = new HistoryTimeLine();
        h.enqueue("고구려");
        h.enqueue("백제");
        h.enqueue("신라");
        h.enqueue("발해");
        h.enqueue("고려");
        h.enqueue("조선");

        System.out.println(h.list);
        h.dequeue();
        h.dequeue();
        h.dequeue();
        h.dequeue();
        System.out.println(h.dequeue());
        System.out.println(h.getSize());


    }

}
