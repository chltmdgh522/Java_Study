package arraylist;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;


    public Student(int studentID, String name) {
        this.studentID = studentID;
        studentName = name;
        subjectList = new ArrayList<Subject>(); //학생이 한명 생성되면 배열도 생성
    }


    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);
        subjectList.add(subject);

    }

    public void show() {
        for (Subject subject : subjectList) {
            System.out.println(subject.getName()
                    + subject.getScore() + studentName);
        }
    }


}
