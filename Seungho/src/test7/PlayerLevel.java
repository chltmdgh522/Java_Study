package test7;

public abstract class PlayerLevel {
	
	String name;
	public PlayerLevel(String name){
		this.name=name;
	}
	public abstract void run();
	public abstract void situation();
	public abstract void strength();
	public void showMessage() {}
	public void gameStart() {
		System.out.println("게임을 시작합니다.");	
	}
	public void gameStop() {
		System.out.println("게임을 종료합니다.");	
	}
	public void name() {
		System.out.println("용사의 이름은 "+name+"입니다.");	
	}
	
	public void jump(){
		System.out.println("점프를 합니다.");	
	}
	public final void show(int count) {
		name();
		gameStart();	
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		situation();
		strength();
		gameStop();
		
	}

}
