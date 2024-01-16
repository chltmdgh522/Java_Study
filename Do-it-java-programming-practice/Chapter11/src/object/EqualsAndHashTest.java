package object;

class Student{
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentID=studentID;
		this.studentName=studentName;
	}

	@Override
	public boolean equals (Object obj) {
		if(obj instanceof Student){//object타입이라 다운캐스팅 작업
			Student s=(Student)obj;
			if(studentID==s.studentID) {
				return true;
			}
			else
				return false;
			
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentID;
	}
	
}

public class EqualsAndHashTest {

	public static void main(String[] args) {
		String str1=new String("test");
		String str2=new String("test");
		
		System.out.println(str1==str2);//주소가 다르다
		System.out.println(str1.equals(str2)); // 논리적정의를 위해 쓴다? 흠
		//문자열이 같다.
		System.out.println(str1.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		//equals 값이 true면 동일한 해쉬값을 가짐 
		Student s1= new Student(01,"최승호");
		Student s2= new Student(01,"최승호");
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	

	}

}