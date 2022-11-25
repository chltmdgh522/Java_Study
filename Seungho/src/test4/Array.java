package test4;

public class Array {

	public static void main(String[] args) {
		
		int[]a;
		int sum=add(new int[] {1,2,3,4});
		
		System.out.println(sum);
		
	}
	
	public static int add(int[]a) {
		
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
			
		}
		return sum;
		
	}
}
// 클래스간 이동함수는 어떻게 구현하지??? 