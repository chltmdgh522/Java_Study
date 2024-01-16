package inheritance;

public class OverridingTest {

    public static void main(String[] args) {

        Customer Moon = new Customer(1, "문홍욱");
        int price = Moon.calcPrice(10000);
        System.out.println(Moon.show() + price);


        VIPCustomer Kim = new VIPCustomer(2, "김용현", 11);
        price = Kim.calcPrice(10000);
        System.out.println(Kim.show() + price + Kim.getAgentID());

        Customer seunghoChoi = new Customer(3, "최승호");
        price = seunghoChoi.calcPrice(10000);
        System.out.println(seunghoChoi.show() + price);

        VIPCustomer minsuLee = new VIPCustomer(4, "이민수", 11);
        price = minsuLee.calcPrice(10000);
        System.out.println(minsuLee.show() + price);

    }

}
