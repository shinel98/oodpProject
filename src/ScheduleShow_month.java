import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ScheduleShow_month extends ScheduleShow_Decorator {
	
	static Scanner sc = new Scanner(System.in);
	
	public ScheduleShow_month(ShowSchedule c) {
		super(c);
	}
	
	@Override
	public void show(ArrayList<Schedule> scheduleList){
		super.show(scheduleList);
		if(scheduleList.isEmpty() == true)
		{
			System.out.println("저장된 스케줄이 없습니다");
		}
		
		else
		{
			Schedule c;
			int i=1;
			int mon;
			String date;
			
			System.out.printf("확인하고 싶은 달: ");
			mon = sc.nextInt();
			
			System.out.printf("\n<<<<<<<%d 월>>>>>>>\n", mon);
			System.out.println("번호  제목  날짜");
			System.out.println("------------------------");
			
			Iterator<Schedule> iter = scheduleList.iterator();
			int index;
			String sub;
			
			while(iter.hasNext()) {
				c = (Schedule)iter.next();
				date = c.getScheduleDate();
				index = date.indexOf("/");
				sub = date.substring(0, index);
				if(mon == Integer.parseInt(sub)) {
					System.out.print(String.format("%2d  ", i++));
					System.out.print(String.format("%3s  ", c.getScheduleName()));
					System.out.print(String.format("%4s\n", c.getScheduleDate()));
				}
			}

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