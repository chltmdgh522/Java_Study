package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student seunghoChoi=new Student(1,"최승호");
		seunghoChoi.addSubject("국어",100);
		seunghoChoi.addSubject("수학",100);
		
		
		Student minsuLee=new Student(2,"이민수");
		minsuLee.addSubject("국어",19);
		minsuLee.addSubject("수학",17);
		
		seunghoChoi.show();
		minsuLee.show();

		
	}
}
