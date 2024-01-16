package study4collection.treeset;

import study4collection.Member;

import java.util.Iterator;
import java.util.TreeSet;


public class MemberTreeSet {
    TreeSet<Member> treeSet = new TreeSet<Member>();
    public void addTreeSet(Member member) {
        treeSet.add(member);
    }

    public boolean removeTreeSet(int id) {
        Iterator<Member> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (id == member.getId()) {
                iterator.remove();
                return true;
            }

        }
        System.out.println(id + "가 존재하지 않습니다.");
        return false;

    }

    public void show() {
        for (Member m : treeSet) {
            System.out.println(m);
        }
    }


}
