package study4collection.hashset;

import study4collection.Member;

public class HashSetTest {
    public static void main(String[] args) {

        MemberHashSet memberHashSet=new MemberHashSet();
        Member m1=new Member(1,"최승호");
        Member m2=new Member(2,"홍세현");
        Member m3=new Member(3,"칠라디");
        memberHashSet.addHashSet(m1);
        memberHashSet.addHashSet(m2);
        memberHashSet.addHashSet(m3);
        memberHashSet.removeHashSet(m1.getId());
        //memberHashSet.removeHashSet(m1);

        memberHashSet.show();


    }
}
