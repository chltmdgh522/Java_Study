package collection.treeset;


import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;
public class MemberTreeSet {
	
	TreeSet<Member> treeSet= new TreeSet<Member>();
	
	public void addTreeSet(Member member) {
		treeSet.add(member);
	}
	public boolean removeTreeSet(int memberId) {
		
		Iterator<Member> iterator=treeSet.iterator();
		while(iterator.hasNext()) {
			Member member=iterator.next();
			if(memberId==member.getMemberId()) {
				iterator.remove();
				return true;
			}
			
		}
	
		System.out.println(memberId+"가 없습니다.");
		return false;
		
	}

	public void show() {
		for(Member member : treeSet)
		System.out.println(member);
	}
	



}
