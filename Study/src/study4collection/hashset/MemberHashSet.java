package study4collection.hashset;

import study4collection.Member;

import java.util.HashSet;
import java.util.Iterator;
public class MemberHashSet {
    HashSet<Member> hashSet=new HashSet<>();

    public void addHashSet(Member member){
        hashSet.add(member);
    }

    public boolean removeHashSet(String name){
        Iterator<Member> iterator=hashSet.iterator();
        while(iterator.hasNext()){
            Member member=iterator.next();
            if(name==member.getName()){
                iterator.remove();
                return true;
            }
        }
        System.out.println(name+"업습니다.");
        return false;
    }

    public void show(){
        for(Member m : hashSet){
            System.out.println("d"+m);
        }
    }











    /*HashSet<Member> hashSet = new HashSet<>();

    public void addHashSet(Member member) {
        hashSet.add(member);
    }


    public boolean removeHashSet(int id) {
        Iterator<Member> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (id == member.getId()) {
                iterator.remove();
                return true;
            }
        }
        System.out.println(id + "없습니당");
        return false;
    }

    public void show() {

        for (Member m : hashSet) {
            System.out.println(m);
        }
    }*/


}
