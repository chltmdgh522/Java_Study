package innerclass;

class Outer{
	
	int outNum=100;
	static int sNum=200;
	Runnable runnable = new Runnable() {
		public void run() {
			System.out.println("runable");
		}
	};
	public Runnable getRunnable(){
		int num=100;
		/* return new Runnalbe(){
		 * public void run() {
				// 메서드의 호출이 끝나서 없어지기 때문에 불가능 -> num+=10;
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(num);
			}
		 * }
		 */
		class MyRunnable implements Runnable{
			@Override
			public void run() {
				// 메서드의 호출이 끝나서 없어지기 때문에 불가능 -> num+=10;
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(num);
			}
		}
		return new MyRunnable();		
	}
}
public class LocalInnerTest {

	public static void main(String[] args) {
		Outer outer =new Outer();
		outer.getRunnable().run();
		
		outer.runnable.run();
	}

}
