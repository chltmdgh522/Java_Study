package staticex;

public class Student {

    static int seriaNum = 10000;


    int studentID;
    String studentName;

    public Student() {
        seriaNum++;
        studentID = seriaNum;
    }

	/*public static int getSeriaNum() {
		return seriaNum; // static변수
		int i=1;//지역 변수
		studentName="dd";// 인스턴스 변수
	
	}

	public static void setSeriaNum(int seriaNum) {
		Student.seriaNum = seriaNum;
	}*/

}
