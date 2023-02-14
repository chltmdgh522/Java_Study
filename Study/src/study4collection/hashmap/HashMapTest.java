package study4collection.hashmap;

import study4collection.Member;

public class HashMapTest {
    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();
        Member m1 = new Member(1, "최승호");
        Member m2 = new Member(2, "최승호");
        Member m3 = new Member(3, "최승호");
        Member m4 = new Member(1, "최승");

        memberHashMap.addHashMap(m1);
        memberHashMap.addHashMap(m2);
        memberHashMap.addHashMap(m3);
        memberHashMap.addHashMap(m4);

        memberHashMap.removeHashMap(m1.getId());

        memberHashMap.show();

    }
}
