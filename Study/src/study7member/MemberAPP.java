package study7member;

import study7member.member.Grade;
import study7member.member.Member;
import study7member.member.MemberService;
import study7member.member.MemberServiceImpl;

public class MemberAPP {
    public static void main(String[] args) {
        Member member=new Member(1L,"최승호", Grade.VIP);
        MemberService memberService=new MemberServiceImpl();
        memberService.join(member);
        Member find=memberService.findMember(1L);
        System.out.println(find.getName());
        System.out.println(member.getName());



    }


}
