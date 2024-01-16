package making.studentinformation;

import java.util.HashMap;

public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student("최승호", 1);
        Student s2 = new Student("홍세현", 2);
        Student s3 = new Student("이민수", 3);
        Student s4 = new Student("칠라디", 4);

        s1.setKorea("국어", 100);
        s1.setMath("수학", 100);
        s1.setEnglish("영어", 100);

        s2.setKorea("국어", 75);
        s2.setMath("수학", 87);
        s2.setEnglish("영어", 68);

        s3.setKorea("국어", 75);
        s3.setMath("수학", 82);
        s3.setEnglish("영어", 61);

        s4.setKorea("국어", 76);
        s4.setMath("수학", 65);
        s4.setEnglish("영어", 92);

        s1.show();
        s2.show();
        s3.show();
        s4.show();

    }
}
