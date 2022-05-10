import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ScheduleList {
	
	private ArrayList<Schedule> scheduleList = new ArrayList<Schedule>();
	static Scanner sc = new Scanner(System.in);
	
	public int showMenu() {
		int choice;
		
		System.out.println("======================");
		System.out.println("1. 스케줄 조회");
		System.out.println("2. 스케줄 추가");
		System.out.println("3. 스케줄 삭제");
		System.out.println("4. 스케줄 수정");
		System.out.println("0. 메인메뉴로 돌아가기");
		System.out.println("======================");
		
		System.out.print(">> ");
		return sc.nextInt();
	}
	
	public void showSchedule()
	{
		if(scheduleList.isEmpty() == true)
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
		}
	}
	
	public void addSchedule()
	{
		Schedule newSchedule = new Schedule();
		sc.nextLine();
		System.out.print("스케줄 제목을 입력하세요: ");
		newSchedule.setScheduleName(sc.nextLine());
		
		System.out.print("스케줄 날짜을 입력하세요: ");
		newSchedule.setScheduleDate(sc.nextLine());
		
		scheduleList.add(newSchedule);
	}
	
	public void deleteSchedule()
	{
		if(scheduleList.isEmpty() == true)
			System.out.println("등록된 스케줄이 없습니다");
		
		else
		{
			showSchedule();
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
			showSchedule();
			
			int num=0;
			System.out.print("수정할 기록 번호: ");
			num = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("수정할 이름: ");
			scheduleList.get(num-1).setScheduleName(sc.nextLine());
			
			System.out.print("수정할 날짜: ");
			scheduleList.get(num-1).setScheduleDate(sc.nextLine());
		}
		
		
	}

}
