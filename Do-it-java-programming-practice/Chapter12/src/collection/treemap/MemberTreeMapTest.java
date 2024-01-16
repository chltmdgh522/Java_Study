package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap=new MemberTreeMap();
		
		Member m1=new Member(02,"최승호");
		Member m2=new Member(01,"칠라디");
		Member m3=new Member(03,"리민수");
		Member m4=new Member(03,"리민수");
		
		memberTreeMap.addMember(m1);
		memberTreeMap.addMember(m2);
		memberTreeMap.addMember(m3);
		memberTreeMap.addMember(m4);
		
		
		memberTreeMap.show();
		
		memberTreeMap.removeMember(01);
	
	

	}

}

