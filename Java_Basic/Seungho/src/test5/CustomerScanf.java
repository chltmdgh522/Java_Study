package test5;

import java.util.ArrayList;

public class CustomerScanf {

    public static void main(String[] args) {

        Customer Jang = new Customer("장유성", 01);
        Customer Lee = new VIPCustomer("이민수", 02, 5);
        GoldCustomer Kim = new GoldCustomer("김용현", 03);
        DiamondCustomer Choi = new DiamondCustomer("최승호", 04, 5, "헬리콥터");

        ArrayList<Customer> customerList = new ArrayList<Customer>();
        customerList.add(Choi);
        customerList.add(Lee);
        customerList.add(Kim);
        customerList.add(Jang);

        for (Customer a : customerList) {
            int price = 10000;
            price = a.calc(price);
            System.out.println("지불금액은" + price + "원 입니다." + a.show());

        }


    }

}
