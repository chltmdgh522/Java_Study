package test4;

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book library1[]=new Book[3];
		library1[0]=new Book("삼국사기","최승호");
		library1[1]=new Book("삼국유사","승호");
		library1[2]=new Book("제왕운기","호");
		
		Book library2[]=new Book[3];
		library2[0]=new Book();
		library2[1]=new Book();
		library2[2]=new Book();
		
		for(int i=0; i<library2.length; i++) {
			
			library2[i].setBookName(library1[i].getBookName());
			library2[i].setAnother(library1[i].getAnother());
		}
	
		
		
	
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


