package scheduler;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException  {
		System.out.println("전화상담 배분방식을 선택하세요. R L P");
		
		int ch= System.in.read();
		
		Scheduler sch= null;
		
		if(ch=='R') {
			sch=new RoundRobin();
		}
		
		else if(ch=='P') {
			sch=new PriorityAllocation();
		}
		
		else if(ch=='L') {
			sch=new LeastJob();
		}
		
		sch.getNextCall(); // 다형성 
		sch.sendCallToAgent();

	}

}
