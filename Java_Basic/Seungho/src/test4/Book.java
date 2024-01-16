package test4;

public class Book {

    String bookName;
    String another;

    public Book() {
    }

    ;

    public Book(String bookName, String another) {
        this.bookName = bookName;
        this.another = another;

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }

    public void show() {
        System.out.println(bookName + another);
    }


}
