package study7member;

import study7member.member.*;

public class MemberAPP {
    public static void main(String[] args) {
        Member member = new Member(1L, "최승호", Grade.VIP);
        AppConfig appConfig=new AppConfig();
        MemberService memberService = appConfig.memberService();
        memberService.join(member);
        Member find = memberService.findMember(1L);
        System.out.println(find.getName());
        System.out.println(member.getName());

    }

}
