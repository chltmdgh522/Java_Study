package study7member.member;

public interface MemberRepository {

    void save(Member member);

    Member findByMember(Long id);
}
