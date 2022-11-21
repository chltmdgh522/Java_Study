package bookshelf;

public class Test {

	public static void main(String[] args) {
		Queue sq=new BookShelf();
		
		sq.enQueue("고구려");
		sq.enQueue("발해");
		sq.enQueue("고려");
		System.out.println(sq.deQueue());
		System.out.println(sq.deQueue());
		System.out.println(sq.getSize());

	}

}
