package study7member;

import study7member.discount.DiscountPolicy;
import study7member.discount.FixDiscountPolicy;
import study7member.member.MemberRepository;
import study7member.member.MemberService;
import study7member.member.MemberServiceImpl;
import study7member.member.MemoryMemberRepository;
import study7member.order.OrderService;
import study7member.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(),discountPolicy());
    }

    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
        //new RateDiscountPolicy();
    }

}
