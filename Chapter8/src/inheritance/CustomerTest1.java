package inheritance;

public class CustomerTest1 {

    public static void main(String[] args) {
        Customer seunghoChoi = new Customer(11, "최승호");
        int price = seunghoChoi.calcPrice(10000);

        VIPCustomer minsuLee = new VIPCustomer(12, "이민수", 11);
		
		
		/*Customer minsuLee=new VIPCustomer(12,"이민수");
		 하위클래스가 상위클래스를 내포하기 떄문에 가능함 이거를 업캐스팅?
		 이해 안간다. 타빕이 Customer이기 때무에 변수나 메서드도 Customer임
		 */

        minsuLee.bonusPoint = 1000;


        System.out.println(seunghoChoi.show() + price);
        System.out.println(minsuLee.show());

    }

}
