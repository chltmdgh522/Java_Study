package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentChoi=new Student(100,"최승호");
		studentChoi.setKorea("국어", 100);
		studentChoi.setMath("수학", 100);
		
		Student studentKim=new Student(101,"김승호");
		studentKim.setKorea("국어", 1000);
		studentKim.setMath("수학", 10);
		
		studentChoi.showStudentInfor();
		studentKim.showStudentInfor();
	}

}
