package test9;

public class GenericMethod {

	public static <T, V> double makeRectangle(Point<T,V>p1,Point<T,V>p2){
		
		double left=((Number)p1.getX()).doubleValue();
		double top=((Number)p1.getY()).doubleValue();
		double right=((Number)p2.getX()).doubleValue();
		double bottom=((Number)p2.getY()).doubleValue();
		
		double height=top-bottom;
		double weight=right-left;
		
		return weight*height;
	
		
	}
	public static void main(String[] args) {
		
		Point<Integer, Double> p1 = new Point<Integer, Double>(0,10.0);
		Point<Integer,Double>p2 = new Point<Integer,Double>(10,0.0);
		
		System.out.println("사각형의 넓이는"+GenericMethod.makeRectangle(p1, p2)+"입니다.");
		
		Integer a =7;
		System.out.println(a.doubleValue());
		System.out.println(a.floatValue());
		System.out.println(a.longValue());
		System.out.println(a.intValue());
 
	
}
}