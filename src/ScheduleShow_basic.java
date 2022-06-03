import java.util.ArrayList;
import java.util.Iterator;

public class ScheduleShow_basic extends ScheduleList implements ShowSchedule {
 
	/*
	public ScheduleListIterator iterator() {
		
		return new ScheduleListIterator(this);
	}*/
	
	
	@Override
	public void show(ArrayList<Schedule> scheduleList) {
		
		if(scheduleList.isEmpty() == true)
		{
			System.out.println("저장된 스케줄이 없습니다");
		}
		
		else
		{
			Schedule c;
			int i=1;
			
			System.out.println("전체 스케줄 목록");
			System.out.println("------------------------");
			System.out.println("번호  제목  날짜");
			System.out.println("------------------------");
			
			
			Iterator<Schedule> iter = scheduleList.iterator();
			
			while(iter.hasNext()) {
				c = (Schedule)iter.next();
				System.out.print(String.format("%2d  ", i++));
				System.out.print(String.format("%3s  ", c.getScheduleName()));
				System.out.print(String.format("%4s\n", c.getScheduleDate()));
			}
			System.out.println("------------------------");
			System.out.println();
		}
		
	}
	
}