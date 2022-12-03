package test7;

public class Silver extends PlayerLevel {

	public Silver(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("이동속도가 보통입니다.");
		
	}

	@Override
	public void strength() {
		System.out.println("체력이 정상입니다.");
		
	}
	public void showMessage() {
		System.out.println("레벨이 은입니다.");
		
	}

	@Override
	public void situation() {
		System.out.println("횟수 높이 수준이 보통이라 무난히 갔습니다.");
		
	}
	

}