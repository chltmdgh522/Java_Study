package study7member.member;

public class MemberServiceImpl implements MemberService {

    MemoryMemberRepository a= new MemoryMemberRepository();


    @Override
    public void join(Member member) {
        a.save(member);
    }

    @Override
    public Member findMember(Long id) {
        return a.findByMember(id);
    }
}
