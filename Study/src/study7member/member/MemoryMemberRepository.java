package study7member.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {
    Map<Long, Member> hashMap=new HashMap<>();

    @Override
    public void save(Member member) {
        hashMap.put(member.getId(), member);
    }

    @Override
    public Member findById(Long id) {
        return hashMap.get(id);
    }
}
