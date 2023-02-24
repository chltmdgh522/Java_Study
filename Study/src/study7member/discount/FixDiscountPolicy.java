package study7member.discount;

import study7member.member.Grade;
import study7member.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    int fixDiscountPrice=1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP){
            return fixDiscountPrice;
        }else{
            return 0;
        }
    }
}
