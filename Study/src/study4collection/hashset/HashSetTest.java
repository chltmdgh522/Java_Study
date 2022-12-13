package study4collection.hashset;

import study4collection.Member;

public class HashSetTest {
    public static void main(String[] args) {
        MemberHashSet m=new MemberHashSet();
        Member m1 =new Member(2,"최승호");
        Member m2 =new Member(3,"홍세현");
        Member m3 =new Member(1,"명승진");
        m.addHashSet(m1);
        m.addHashSet(m2);
        m.addHashSet(m3);
        m.removeHashSet(1);

        m.show();



    }
}
