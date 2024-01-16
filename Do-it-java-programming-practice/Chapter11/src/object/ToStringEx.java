package object;

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.author=author;
		this.title=title;
		
	}

	@Override
	public String toString() {
		return title+","+author;
	} 
	
}

public class ToStringEx {

	public static void main(String[] args) {
		
		Book book=new Book("고구려","승호");
		
		System.out.println(book);
		
		String str=new String("test");
		System.out.println(str);
		
	}
}
