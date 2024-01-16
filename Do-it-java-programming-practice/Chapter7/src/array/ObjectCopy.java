package array;

public class ObjectCopy {

    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("고구려", "최승호");
        bookArray1[1] = new Book("고려", "최승호");
        bookArray1[2] = new Book("발해", "최승호");


        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
        //주소가 복사됨

        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBook();
        }

        bookArray1[0].setBookName("당나라");


        bookArray1[2] = new Book("해", "최승호");

        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBook();
        }


    }


}
