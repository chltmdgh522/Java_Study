package test4;

public class ObjectCopy1 {

	public static void main(String[] args) {
		Book library1[]=new Book[3];
		library1[0]=new Book("삼국사기","최승호");
		library1[1]=new Book("삼국유사","승호");
		library1[2]=new Book("제왕운기","호");
		
		Book library2[]=new Book[3];
		System.arraycopy(library1,0,library2,0,3);
		
	
	
		library1[0].setBookName("조선왕조실록");
		
		
		for(int i=0; i<library2.length; i++) {
			
			library1[i].show();
		}		
		
		System.out.println("==================");
	
		for(int i=0; i<library2.length; i++) {
			
			library2[i].show();
		}		
	}

}
