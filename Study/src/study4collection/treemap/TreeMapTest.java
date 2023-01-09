package study4collection.treemap;

import study4collection.Member;

public class TreeMapTest {
    public static void main(String[] args) {

        MemberTreeMap memberTreeMap=new MemberTreeMap();
        Member m1= new Member(1,"최승호");
        Member m2= new Member(2,"정승호");
        Member m3= new Member(3,"김승호");

        memberTreeMap.addTreeMap(m1);
        memberTreeMap.addTreeMap(m2);
        memberTreeMap.addTreeMap(m3);
        memberTreeMap.show();

        memberTreeMap.removeTreeMap(m1.getId());
        memberTreeMap.show();

    }
}
