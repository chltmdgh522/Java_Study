package test2;

public class TakeTrains {

	public static void main(String[] args) {
		Student seunghoChoi=new Student("최승호",3,5000);
		
		
		Student minsuLee=new Student("이민수",2,6000);
		
		
		Bus bus100=new Bus(100);
		Subway subway1=new Subway(1);
		Taxi taxi11=new Taxi(11);
		
		seunghoChoi.takeBus(bus100);
		seunghoChoi.takeSubway(subway1);
		seunghoChoi.takeTaxi(taxi11);
		
		minsuLee.takeBus(bus100);
		
		seunghoChoi.show();
		minsuLee.show();
		bus100.show();
		subway1.show();
		taxi11.show();

		
	}

}