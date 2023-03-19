package study7member.order;

import study7member.discount.DiscountPolicy;
import study7member.discount.FixDiscountPolicy;
import study7member.member.Member;
import study7member.member.MemberRepository;
import study7member.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    MemberRepository memberRepository=new MemoryMemberRepository();
    DiscountPolicy discountPolicy=new FixDiscountPolicy();

    @Override
    public Order createOrder(Long id, String itemName, int itemPrice) {
        Member member=memberRepository.findById(id);
        int discountPrice=discountPolicy.discount(member,itemPrice);
        return new Order(id, itemName, itemPrice, discountPrice);
    }
}
