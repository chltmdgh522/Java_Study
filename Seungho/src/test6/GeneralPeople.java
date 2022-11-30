package test6;

public class GeneralPeople extends Subway{
	
	@Override
	public void horrer() {
		System.out.println("지하철이 안무섭습니다.");
		
	}

	@Override
	public void noJam() {
		System.out.println("지하철이 흥미진진하지않습니다");
		
	}
	
	public void level() {
		System.out.println("사람들 수준이 매우 높습니다.");
		
	}
}