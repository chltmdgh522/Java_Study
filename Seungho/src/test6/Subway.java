package test6;

public abstract class Subway {
	
	public abstract void horrer();
	public abstract void noJam();
	
	public void level() {}
	
	
	
	public void start() {
		System.out.println("지하철이 움직입니다.");
		
	}
	
	public void stop() {
		System.out.println("지하철이 움직입니다.");
		
	}
	
	public final void show() {
		start();
		horrer();
		noJam();
		level();
		stop();
		
	}

}