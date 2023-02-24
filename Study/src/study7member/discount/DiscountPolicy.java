package study7member.discount;

import study7member.member.Member;

public interface DiscountPolicy {

    int discountPolicy(Member member, int price);
}
