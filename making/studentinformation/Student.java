package making.studentinformation;

import java.util.HashMap;

public class Student {
    String name;
    int id;
    Subject korea, math, english;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        korea = new Subject();
        math = new Subject();
        english = new Subject();//student 클래스 타입이 아니니깐 연관시켜줄려면 생성자 생성

    }

    public void setKorea(String subjectName, int score) {
        korea.setSubjectName(subjectName);
        korea.setScore(score);
    }

    public void setMath(String subjectName, int score) {
        math.setSubjectName(subjectName);
        math.setScore(score);
    }

    public void setEnglish(String subjectName, int score) {
        english.setSubjectName(subjectName);
        english.setScore(score);
    }

    int a = 0;
    HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

    public void show() {

        int total = (korea.getScore() + math.getScore() + english.getScore()) / 3;

        if (total > a) {
            System.out.println(id + " " + name + "는(은)" + total + "입니다.");
        }
        else if(a>total){
            a=total;
        }


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
