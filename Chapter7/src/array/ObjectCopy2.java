package array;

public class ObjectCopy2 {

    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("고구려", "최승호");
        bookArray1[1] = new Book("고려", "최승호");
        bookArray1[2] = new Book("발해", "최승호");

        bookArray2[0] = new Book();
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();

        for (int i = 0; i < bookArray1.length; i++) {
            bookArray2[i].setBookName(bookArray1[i].getBookName());
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
        }

        bookArray1[0] = new Book("당나라", "최승호");
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBook();
        }
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBook();
        }

        String[] strArr = {"Java", "Android", "C"};

        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);

        }
        for (String a : strArr) {
            System.out.println(a);

        }


    }

}
