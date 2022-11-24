package test3;

import java.util.ArrayList;

public class Student {
	
	String studentName;
	int studentID; 
	ArrayList<Subject> subjectList;
	
	public Student(String studentName, int studentID) {
		this.studentID=studentID;
		this.studentName=studentName;
		subjectList=new ArrayList<Subject>();
	}
	
	public void addSubject(String subjectName, int subjectScore) {
		Subject subject=new Subject();
		subject.setSubjectName(subjectName);
		subject.setSubjectScore(subjectScore);
		
		subjectList.add(subject);
		
	}
	
	public void show() {
		
		for(Subject subject : subjectList) {
		System.out.println( studentID + studentName + subject.getSubjectName() + subject.getSubjectScore()) ; 
		}		
		
	}
	

}
