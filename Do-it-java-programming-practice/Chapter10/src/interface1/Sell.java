package interface1;

public interface Sell {

	
	public void sell();
	
	default void order() {
		System.out.println("매중");
		
	}
}
