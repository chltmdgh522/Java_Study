package study7member.discount;

import study7member.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
