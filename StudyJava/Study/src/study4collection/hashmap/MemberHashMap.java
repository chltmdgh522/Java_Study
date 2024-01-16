package study4collection.hashmap;

import study4collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    HashMap<Integer, Member> hashMap = new HashMap<>();

    public void addHashMap(Member member) {
        hashMap.put(member.getId(), member);
    }

    public boolean removeHashMap(int id) {
        if (hashMap.containsKey(id)) {
            hashMap.remove(id);
        }
        return true;
    }

    public void show() {
        for (Integer key : hashMap.keySet()) {
            System.out.println(key + ":" + hashMap.get(key));

        }

        Iterator<Integer> ir = hashMap.keySet().iterator();
        while (ir.hasNext()) {
            int key = ir.next();
            Member m = hashMap.get(key);
            System.out.println(m);
            System.out.println(hashMap.get(1));
        }
    }


}
