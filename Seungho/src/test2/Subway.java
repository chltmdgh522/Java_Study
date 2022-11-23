package test2;

public class Subway {
	
	int subwayNum;
	int passenger;
	int money;
	
	public Subway(int subwayNum) {
		this.subwayNum=subwayNum;
	}
	
	public void take(int money) {
		
		passenger++;
		this.money+=money;
		
	}
	public void show() {
		System.out.println("지하철" + subwayNum+"번의 승객은"+passenger+
				"명이고, 수입은"+money+"입니다.");
		
	}

}