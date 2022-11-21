package collection.treemap;


import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {
	
	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		
		treeMap= new TreeMap<Integer, Member>(new Member());	
				
	} 
	
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
		
	}
	
	public boolean removeMember(int memberId) {
		for(int i=0; i<treeMap.size(); i++) {
			Member member=treeMap.get(i);
			
			if(memberId==member.getMemberId()) {
				treeMap.remove(i);
				return true;
			}
			
		}
		
		System.out.println(memberId+"가 없습니다.");
		return false;
	}
	
	public void show() {
		Iterator<Integer> ir=treeMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key=ir.next();
			Member member=treeMap.get(key);
			
			System.out.println(member);
			
		}
	}

}
