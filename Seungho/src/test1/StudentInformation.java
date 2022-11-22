package test1;

public class StudentInformation {
	String studentName;
	int studentID;
	StudentSubjectScore korea;
	StudentSubjectScore math;
	StudentSubjectScore english;
	
	
	public StudentInformation(String name, int id) {
		studentName=name;
		studentID=id;
		korea=new StudentSubjectScore();
		math=new StudentSubjectScore();
		english=new StudentSubjectScore();
	}
	public void setKorea(String sub, int score) {
		korea.setSubject(sub);
		korea.setScore(score);
	}
	public void setMath(String sub, int score) {
		math.setSubject(sub);
		math.setScore(score);
	}
	public void setEnglish(String sub, int score) {
		english.setSubject(sub);
		english.setScore(score);
	}
	
	public void show() {
		int total;
		total=korea.getScore()+math.getScore()+english.getScore();
		System.out.println(studentID+"."+studentName+"의 "+korea.getSubject()+" "+math.getSubject()+" "+
				english.getSubject()+" 점수의 총점은 "+ total+"점 입니다.");
		
	}
	
}
