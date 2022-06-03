import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ScheduleShow_urgent extends ScheduleShow_Decorator {
	
	static Scanner sc = new Scanner(System.in);
	
	public ScheduleShow_urgent(ShowSchedule c) {
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
			String mon;
			String day;
			String today;
			String date;
			int index;
			String submon;
			String subday;
			
			//예외처
			/*int cont = 0;
			while(cont == 0) {
				System.out.printf("오늘 날짜: ");
				today = sc.next();
				index = today.indexOf("/");
				mon = today.substring(0, index);
				day = today.substring(index + 1);
				if((Integer.parseInt(mon) < 1 && Integer.parseInt(mon) > 12) && (Integer.parseInt(day) < 1 && Integer.parseInt(day) > 31))
					continue;
				
				else {
					cont = 1;
					break;
				}
				
			}*/
			System.out.printf("오늘 날짜: ");
			today = sc.next();
			index = today.indexOf("/");
			mon = today.substring(0, index);
			day = today.substring(index + 1);
			
			System.out.println("얼마 남지 않은 스케줄 목록\n(오늘 이후 1주일 이내의 스케줄 목록) ");
			System.out.println("------------------------");
			System.out.println("번호  제목  날짜");
			System.out.println("------------------------");
			
			Iterator<Schedule> iter = scheduleList.iterator();
			
			while(iter.hasNext()) {
				c = (Schedule)iter.next();
				date = c.getScheduleDate();
				index = date.indexOf("/");
				submon = date.substring(0, index);
				subday = date.substring(index + 1);
				
				if(Integer.parseInt(mon) == Integer.parseInt(submon) && (Integer.parseInt(subday) - Integer.parseInt(day) >= 0 && Integer.parseInt(subday) - Integer.parseInt(day) < 7)) {
					System.out.print(String.format("%2d  ", i++));
					System.out.print(String.format("%3s  ", c.getScheduleName()));
					System.out.print(String.format("%4s\n", c.getScheduleDate()));
				}
				
				else if(Integer.parseInt(submon) - Integer.parseInt(mon) == 1 && (Integer.parseInt(subday) > 0 && Integer.parseInt(subday) < 7) && (Integer.parseInt(day) > 25 && Integer.parseInt(day) < 32)) {
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