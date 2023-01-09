package study4collection.treemap;

import study4collection.Member;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {

    TreeMap<Integer, Member> treeMap=new TreeMap<Integer, Member>(new Member());

    public void addTreeMap(Member member){
        treeMap.put(member.getId(),member);
    }

    public boolean removeTreeMap(int id){
        Iterator<Integer> ir= treeMap.keySet().iterator();
        while(ir.hasNext()){
            int key=ir.next();
            if(id==key){
                ir.remove();
                return true;
            }
        }
        return false;
    }
    /*public void removeTreeMap(int id) {
        if (treeMap.containsKey(id)) {
            treeMap.remove(id);
        }
    }*/

    public void show(){
        Iterator<Integer> ir=treeMap.keySet().iterator();

        while(ir.hasNext()){
            int key= ir.next();
            Member a= treeMap.get(key); // key 값을 넣어줌으로써 Member의 값을 불러올수있다.
            System.out.println(a);

        }
    }

}
