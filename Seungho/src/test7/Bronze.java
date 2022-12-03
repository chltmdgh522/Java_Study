package test7;

public class Bronze extends PlayerLevel {

	public Bronze(String name){
		super(name);
		
	}

	@Override
	public void run() {
		System.out.println("이동속도가 매우 느립니다.");
		}

	@Override
	public void strength() {
		System.out.println("체력이 다 떨어졌습니다.");
		
	}
	public void showMessage() {
		System.out.println("레벨이 동입니다.");
		
	}

	@Override
	public void situation() {
		System.out.println("횟수 높이 수준이 낮아 넘어졌습니다.");
		
	}

}
