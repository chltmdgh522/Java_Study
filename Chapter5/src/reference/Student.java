package reference;

public class Student {
	
	int studentID;
	String studentName;
	Subject korea;
	Subject math; 
	
	public Student() {
		korea=new Subject();
		math=new Subject();
		
	}/* 저렇게 세팅한 이유?*/
	
	public Student(int id, String name) {
		studentID=id;
		studentName=name;
		korea=new Subject();
		math=new Subject();
	}
	public void setKorea(String aname, int score) {
		korea.setSubjectName(aname);
		korea.setScore(score);
		
	}
	public void setMath(String aname, int score) {
		math.setSubjectName(aname);
		math.setScore(score);
		
	}
	public void showStudentInfor() {
		int total=korea.getScore()+math.getScore();
		System.out.println(studentName+total+korea.getSubjectName());
		
	}

}
