package study7member.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
