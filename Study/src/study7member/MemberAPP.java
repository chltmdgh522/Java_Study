package study7member;

import study7member.member.Grade;
import study7member.member.Member;
import study7member.member.MemberService;
import study7member.member.MemberServiceImpl;

public class MemberAPP {
    public static void main(String[] args) {
        Member m1= new Member(1L,"최승호", Grade.VIP);
        MemberService ms=new MemberServiceImpl();
        ms.join(m1);
        Member fm=ms.findMember(1L);

        System.out.println(fm.getName());

    }


}
