package abstractex;

public abstract class Computer {
	
	public abstract void display(); // 구현을 안하겠다 선언만 하겠다
	public abstract void typing();
	// 여기서 어떻게 구현될지 몰라서 실제로 상속되는 쪽에서 구현되기 위해서 씀 
	// 그니깐 구체적으로 나눌려고 한 듯 
	// (하위) 구현에 대한 책임 (상위) 구현에 대한 위임  
	// (하위) 구체적으로 보여줌 (상위) 어떻게 보여질지 보여줌 
	
	public void turnOn() {
		System.out.println("전원을 킵니다.");
		
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
		
	}
	
	
}
