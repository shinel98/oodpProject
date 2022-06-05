import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ScheduleList implements Aggregate{
	
	protected ArrayList<Schedule> scheduleList = new ArrayList<Schedule>();
	static Scanner sc = new Scanner(System.in);
	
	public ScheduleListIterator iterator() {
		
		return new ScheduleListIterator(this);
		
	}
	
	
	public int showMenu2() {
		
		int choice;
		
		System.out.println("======================");
		System.out.println("1. 전체 스케줄 조회");
		System.out.println("2. 월 단위로 스케줄 조회");
		System.out.println("3. 긴급한 스케줄 조회");		
		System.out.println("0. 메인메뉴로 돌아가기");
		System.out.println("======================");
		
		System.out.print(">> ");
		return sc.nextInt();
		
	}
	
	public void showSchedule_all()
	{
		ShowSchedule show_all = new ScheduleShow_basic();
		show_all.show(scheduleList);
		/*if(scheduleList.isEmpty() == true)
		{
			System.out.println("저장된 스케줄이 없습니다");
		}
		
		else
		{
			Schedule c;
			int i=1;
			
			System.out.println("번호  제목  날짜");
			System.out.println("------------------------");
			
			Iterator<Schedule> iter = scheduleList.iterator();
			
			while(iter.hasNext()) {
				c = (Schedule)iter.next();
				System.out.printf("%d  %s  %s\n", i++ ,c.getScheduleName(), c.getScheduleDate());
			}
			System.out.println("------------------------");
			System.out.println();
		}*/
		
	}
	
	public void showSchedule_month()
	{
		
		ShowSchedule show_month = new ScheduleShow_month(new ScheduleShow_basic());
		show_month.show(scheduleList);
		
		/*if(scheduleList.isEmpty() == true)
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
					System.out.printf("%d  %s  %s\n", i++ ,c.getScheduleName(), c.getScheduleDate());
				}
			}

			while(iter.hasNext()) {
				c = (Schedule)iter.next();
				System.out.printf("%d  %s  %s\n", i++ ,c.getScheduleName(), c.getScheduleDate());
			}
			System.out.println("------------------------");
			System.out.println();
		}*/
	}
	
	public void showSchedule_urgent()
	{
		
		ShowSchedule show_urgent = new ScheduleShow_urgent(new ScheduleShow_basic());
		show_urgent.show(scheduleList);
		
		/*if(scheduleList.isEmpty() == true)
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
					System.out.printf("%d  %s  %s\n", i++ ,c.getScheduleName(), c.getScheduleDate());
				}
			}

			while(iter.hasNext()) {
				c = (Schedule)iter.next();
				System.out.printf("%d  %s  %s\n", i++ ,c.getScheduleName(), c.getScheduleDate());
			}
			System.out.println("------------------------");
			System.out.println();
		}*/
	}
	
	public void addSchedule()
	{
		Schedule newSchedule = new Schedule();
		//sc.nextLine();
		System.out.print("스케줄 제목을 입력하세요: ");
		newSchedule.setScheduleName(sc.nextLine());
		
		System.out.print("스케줄 날짜를 <월/일> 형식으로 입력하세요: ");
		newSchedule.setScheduleDate(sc.nextLine());
		
		scheduleList.add(newSchedule);
	}
	
	public void deleteSchedule()
	{
		if(scheduleList.isEmpty() == true)
			System.out.println("등록된 스케줄이 없습니다");
		
		else
		{
			showSchedule_all();
			int del_num;
			
			System.out.print("삭제할 기록 번호: ");
			del_num = sc.nextInt();
			scheduleList.remove(del_num-1);
		}
	}
	
	public void modifySchedule()
	{
		if(scheduleList.isEmpty() == true)
			System.out.println("등록된 스케줄이 없습니다");
		
		else
		{
			showSchedule_all();
			
			int num=0;
			System.out.print("수정할 기록 번호: ");
			num = sc.nextInt();
			
			sc.nextLine();
		
			System.out.print("수정할 이름: ");
			scheduleList.get(num-1).setScheduleName(sc.nextLine());
			
			System.out.print("수정할 날짜를 <월/일> 형식으로 입력: ");
			scheduleList.get(num-1).setScheduleDate(sc.nextLine());
		}	
	}
	public void searchSchedule()
	{
		if(scheduleList.isEmpty() == true)
		{
			System.out.println("저장된 스케줄이 없습니다");
		}
		
		System.out.print("검색할 날짜를 입력하세요: ");
		String date = sc.nextLine();
		
		Schedule c;
		int i=1;
		
		System.out.println("번호  제목  날짜");
		System.out.println("------------------------");
		
		Iterator<Schedule> iter = scheduleList.iterator();
		
		while(iter.hasNext()) {
			c = (Schedule)iter.next();
			if(c.getScheduleDate().equals(date))
				System.out.printf("%d  %s  %s\n", i++ ,c.getScheduleName(), c.getScheduleDate());
		}
		
	}
	
	public ArrayList<Schedule> getScheduleList() {
		return scheduleList;
	}

	public void setScheduleList(ArrayList<Schedule> scheduleList) {
		this.scheduleList = scheduleList;
	}
	

}
