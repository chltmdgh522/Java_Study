package study4collection.treeset;

import com.sun.source.tree.Tree;
import study4collection.Member;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();
        Member m1 = new Member(1, "최승호");
        Member m2 = new Member(2, "최승호");
        Member m3 = new Member(3, "최승호");
        Member m4 = new Member(3, "최승호");
        memberTreeSet.addTreeSet(m1);
        memberTreeSet.addTreeSet(m2);
        memberTreeSet.addTreeSet(m3);
        memberTreeSet.addTreeSet(m4);

        memberTreeSet.show();


    }
}
