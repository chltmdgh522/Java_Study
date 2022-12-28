package study4collection.hashmap;

import study4collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    HashMap<Integer, Member> hashMap = new HashMap<Integer, Member>();

    public void addHashMap(Member member) {
        hashMap.put(member.getId(), member);
    }

    public boolean removeHashMap(int id) {
        if (hashMap.containsKey(id)) {
            hashMap.remove(id);
            return true;
        }
        return false;
    }
    public void show() {
        System.out.println(hashMap);
        Iterator<Integer> ir = hashMap.keySet().iterator();

        while (ir.hasNext()) {
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
            System.out.println(key);
        }
    }

}
