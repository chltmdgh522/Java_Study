package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap=new HashMap<Integer, Member>();
	
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
		
	}

	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)){
			hashMap.remove(memberId);//get - 반환
			return true;
		
		}
		
		System.out.println(memberId+"가 없습니다.");
		return false;
	}
	
	public void show() {
		Iterator<Integer> ir=hashMap.keySet().iterator();
		
		System.out.println(hashMap.keySet());
		
		while(ir.hasNext()) {
			int key=ir.next();
			Member member=hashMap.get(key);
			
			System.out.println(member);
			
		}

	}

}
