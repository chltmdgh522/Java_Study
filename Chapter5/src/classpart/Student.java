package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {}
	public Student(String adress, String name) {
		address=adress;
		studentName=name;
		
	}
	
	public void showStudentInfor() {
		System.out.println(studentName + ","+ address+ ","+ studentID);
		
	}
	
	public String getStudentName() {
		return studentName;
	 
}
	public void setStudentName(String name) {
		studentName=name;
		
	}

	
}
