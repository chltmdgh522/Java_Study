package study7member.discount;

import study7member.member.Grade;
import study7member.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    int discountFixAccount = 2000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAccount;
        } else {
            return 0;
        }
    }
}
