package study4collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Integer> {
    String name;
    int id;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Member() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return name + "님의 아이디는" + id + "입니다.";
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (this.id == member.id) {
                return true;
            } else return false;
        }

        return false;
    }

    @Override
    public int compareTo(Member o1) {
        return this.id - o1.id;
    }

    /*@Override
    public int compare(Member o1, Member o2) {
        return o1.compareTo(o2) * (-1);
    }*/

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2)*(-1);
    }
}
