package study8inheritance;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Customer> list = new ArrayList<>();
        Customer customer1 = new Customer(1, "홍세현");
        Customer customer2 = new VIPCustomer(2, "최승호", 1);
        list.add(customer2);
        list.add(customer1);

        int price = 10000;
        for (Customer customer : list) {
            System.out.println(customer.calcPrice(price));
        }
        for (Customer customer : list) {
            System.out.println(customer.show());
        }

    }
}
