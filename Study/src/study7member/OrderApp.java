package study7member;

import study7member.member.Grade;
import study7member.member.Member;
import study7member.member.MemberService;
import study7member.member.MemberServiceImpl;
import study7member.order.Order;
import study7member.order.OrderService;
import study7member.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService=new MemberServiceImpl();

        OrderService orderService=new OrderServiceImpl();

        Long memberId=1L;

        Member member=new Member(memberId,"최승호", Grade.VIP);
        memberService.join(member);

        Order order=orderService.createOrder(memberId,"최승호옷",10000);
        System.out.println(order.calculatePrice());
    }
}
