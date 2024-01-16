package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet=new MemberTreeSet();
		
		Member m1=new Member(02,"최승호");
		Member m2=new Member(01,"이민수");
		Member m3=new Member(03,"김경진");
		Member m4=new Member(03,"김용현");
		
		memberTreeSet.addTreeSet(m1);
		memberTreeSet.addTreeSet(m2);
		memberTreeSet.addTreeSet(m3);
		memberTreeSet.addTreeSet(m4);
		

		memberTreeSet.show();
	
		

	}
}