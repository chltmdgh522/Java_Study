package study7member.discount;

import study7member.member.Grade;
import study7member.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    int discountPercent=10;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP){
            return price*discountPercent/100;
        }else{
            return 0;
        }
    }
}
