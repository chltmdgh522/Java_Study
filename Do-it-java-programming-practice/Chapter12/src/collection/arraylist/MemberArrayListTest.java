package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList=new MemberArrayList();
		
		Member m1=new Member(01, "최승호");
		Member m2=new Member(02, "조성민");
		Member m3=new Member(03, "이민수");
		
		memberArrayList.addMember(m1);
		memberArrayList.addMember(m2);
		memberArrayList.addMember(m3);
		memberArrayList.removeMember(m1.getMemberId());
		memberArrayList.showAll();
		

	}
}
