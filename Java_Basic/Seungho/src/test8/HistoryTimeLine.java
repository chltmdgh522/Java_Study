package test8;

public class HistoryTimeLine extends TimeLine implements Queue {

    @Override
    public void enqueue(String country) {
        list.add(country);

    }

    @Override
    public String dequeue() {
        return list.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }

}
