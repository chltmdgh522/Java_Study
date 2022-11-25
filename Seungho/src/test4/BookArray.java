package test4;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] books=new Book[3];
		
		books[0]=new Book("신데렐라","최승호");
		books[1]=new Book("백설공주","이민수");
		books[2]=new Book("인어공주","칠라디");
		
		for(int i=0; i<books.length; i++) {
			
			books[i].show();
		}		
	}

}
