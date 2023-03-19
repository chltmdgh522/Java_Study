package study7member.order;

import study7member.discount.DiscountPolicy;
import study7member.discount.FixDiscountPolicy;
import study7member.member.*;

public class OrderServiceImpl implements OrderService {

    MemberRepository memberRepository = new MemoryMemberRepository();
    DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
