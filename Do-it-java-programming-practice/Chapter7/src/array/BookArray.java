package array;

public class BookArray {

    public static void main(String[] args) {

        Book[] library = new Book[5]; // 그 책이 나중에 만들어질 주소의 5개자리가 만들어짐

        library[0] = new Book("고구려", "최승호");
        library[1] = new Book("발해", "최승호");
        library[2] = new Book("고려", "최승호");
        library[3] = new Book("조선", "최승호");
        library[4] = new Book("대한민국", "최승호");

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
            library[i].showBook();
        }


    }

}
