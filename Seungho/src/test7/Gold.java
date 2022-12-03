package test7;

public class Gold extends PlayerLevel {

	public Gold(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("이동속도가 매우 빠릅니다.");
		
	}
	@Override
	public void strength() {
		System.out.println("체력이 무한입니다.");
		
	}
	
	public void showMessage() {
		System.out.println("레벨이 금입니다.");
		
	}
	public void situation() {
		System.out.println("횟수 높이 수준이 높아 안전하게 갔습니다.");
		
	}

}
