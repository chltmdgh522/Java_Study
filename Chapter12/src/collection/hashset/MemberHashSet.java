package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;
public class MemberHashSet {
	
	HashSet<Member> hashSet= new HashSet<Member>();
	
	public void addHashSet(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeHashSet(int memberId) {
		
		Iterator<Member> iterator=hashSet.iterator();
		while(iteratsor.hasNext()) {
			Memb member=iterator.next();
			if(memberId==member.getMemberId()) {
				iterator.remove();
				return true;
			}
		}
		System.out.println(memberId+"가 없습니다.");
		return false;
	}
	public void show() {
		for(Member member : hashSet)
		System.out.println(member);
	}
}
