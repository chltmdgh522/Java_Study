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

        long memberId = 1L;
        Member member = new Member(memberId, "최승호", Grade.VIP);
        MemberService memberService=new MemberServiceImpl();
        memberService.join(member);

        OrderService orderService=new OrderServiceImpl();
        Order order =orderService.createOrder(memberId, "포켓몬빵", 2500);
        System.out.println(order);
        System.out.println(order.calculatePrice());

    }
}
