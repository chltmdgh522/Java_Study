package classpart;

public class StudentTest {

    public static void main(String[] args) {

        Student studentChoi = new Student("d", "최승호");


        Student studentKim = new Student();
        studentKim.studentName = "김승호";
        studentKim.studentID = 101;
        studentKim.address = "김포";

        studentChoi.showStudentInfor();
        studentKim.showStudentInfor();

        System.out.println(studentChoi);
        System.out.println(studentKim);
    }
}
