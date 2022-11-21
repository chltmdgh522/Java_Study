package array;

public class TwoArray {

	public static void main(String[] args) {
		int[][]arr={{1,2,3},{4,5,6}};
		
		
		System.out.println(arr.length); // 행(가)의 길이 2
		System.out.println(arr[0].length); //열(세)의 길이3
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.println(arr[i][j]);
				
			}
			
		}
		char[][] alphabets=new char[26][2];
		char word='A', worda='a';
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[0].length; j++) {
				if(j==0) {
					alphabets[i][j]=word;
					word++;
				}
				else {
					alphabets[i][j]=worda;
					worda++;
				}
				
				System.out.println(alphabets[i][j]);
				
			}
			
		}
		

	}

}
