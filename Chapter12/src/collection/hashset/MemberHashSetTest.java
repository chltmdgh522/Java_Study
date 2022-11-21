package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet=new MemberHashSet();
		
		Member m1=new Member(01,"최승호");
		Member m2=new Member(02,"이민수");
		Member m3=new Member(03,"김경진");
		Member m4=new Member(03,"장유성");
		
		memberHashSet.addHashSet(m1);
		memberHashSet.addHashSet(m2);
		memberHashSet.addHashSet(m3);
		memberHashSet.addHashSet(m4);
		
		
		memberHashSet.show();
		
		memberHashSet.removeHashSet(m1.getMemberId());

	}

}
