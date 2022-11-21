package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	
	private ArrayList<Member> list;
	public MemberArrayList() {
		list=new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		list.add(member);
	}
	
	public boolean removeMember(int memberId) {
		/*for(int i=0; i<list.size(); i++) {
			Member member=list.get(i);
			
			if(memberId==member.getMemberId()) {
				list.remove(i);
				return true;
			}
			
		}*/
		
		Iterator<Member> iterator=list.iterator();
		while(iterator.hasNext()/*다음번에 가져올 요소가 있냐*/) {
			Member member = iterator.next();
			if(memberId==member.getMemberId()) {
				list.remove(member);
				return true;
			
		}
		}
		
		System.out.println(memberId+"가 없습니다.");
		return false;
	}
	
	public void showAll() {
		
		for(Member member:list) {
			System.out.println(member);
		} 		
		System.out.println();
		
}
	
}
