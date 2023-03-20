package study7member;

import study7member.member.Grade;
import study7member.member.Member;
import study7member.member.MemberService;
import study7member.order.Order;
import study7member.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();
        long memberId = 1L;
        Member member = new Member(memberId, "최승호", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "포켓몬빵", 2500);
        System.out.println(order);
        System.out.println(order.calculatePrice());

    }
}
