package study4collection;

public class Member {
    String name;
    int id;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
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
    public String toString(){
        return name+"님의 아이디는"+id+"입니다.";
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){
            Member member=(Member)obj;
            if(this.name==member.name){
                return true;
            }
            else return false;
        }

        return false;
    }
}
