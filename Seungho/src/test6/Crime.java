package test6;

public class Crime extends Subway {

	@Override
	public void horrer() {
		System.out.println("지하철이 무섭습니다.");
		
	}

	@Override
	public void noJam() {
		System.out.println("지하철이 흥미진진합니다");
		
	}
	
	public void level() {
		System.out.println("사람들 수준이 매우 낮습니다.");
		
	}

}
