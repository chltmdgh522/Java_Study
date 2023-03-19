package study7member.order;

public interface OrderService {

    Order createOrder(Long id, String itemName, int itemPrice);
}
