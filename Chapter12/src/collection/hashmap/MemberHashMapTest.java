package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap=new MemberHashMap();
		
		Member m1=new Member(01,"최승호");
		Member m2=new Member(02,"칠라디");
		Member m3=new Member(03,"리민수");
		Member m4=new Member(04,"리민수");
		
		memberHashMap.addMember(m1);
		memberHashMap.addMember(m3);
		memberHashMap.addMember(m2);
		memberHashMap.show();
		
		
	


	}
}
