import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int subchoice;
		Task tsk = new Task();
		Team team = new Team();
		RecordList record = new RecordList();
		ScheduleList schedule = new ScheduleList();
		Option option = new Option();
		
		while(true) {
			
			choice = showMainMenu();
			if(choice == 1)
			{
				while (true)
				{
					subchoice = team.showMenu();
					String userName;
					int userID;
					
					if(subchoice == 1)
						team.addMember();
					
					else if(subchoice == 2)
						team.deleteMember();
					
					else if(subchoice == 3)
						team.showMember();
					
					else if(subchoice == 0) {
						break;
					}
				}
			}
			
			else if(choice == 2)
			{
				while(true)
				{
					subchoice = record.showMenu();
					if(subchoice == 1)
						record.showRecord();
					else if(subchoice == 2)
						record.addRecord();
					else if(subchoice == 3) {
						record.deleteRecord();
					}
					else if(subchoice == 4) {
						record.modifyRecord();
					}
					else if(subchoice == 0) {
						break;
					}
				}
			}
			
			else if(choice == 3)
			{
				while(true)
				{
					subchoice = tsk.showMenu();
					if(subchoice == 1)
						tsk.showTask();
					else if(subchoice == 2)
						tsk.addTask();
					else if(subchoice == 3) {
						tsk.deleteTask();
					}
					else if(subchoice == 4) {
						tsk.updateTask();
					}
					else if(subchoice == 0) {
						break;
					}
				}
			}
			
			else if (choice == 4)
			{
				while(true)
				{
					subchoice = schedule.showMenu();
					if(subchoice == 1)
						schedule.showSchedule();
					else if(subchoice == 2)
						schedule.addSchedule();
					else if(subchoice == 3) {
						schedule.deleteSchedule();
					}
					else if(subchoice == 4) {
						schedule.modifySchedule();
					}
					else if(subchoice == 0) {
						break;
					}
				}
			}
			
			else if (choice == 5)
			{
				while(true)
				{
					subchoice = option.showMenu();
					if(subchoice == 1)
						option.setFontType();
					else if(subchoice == 2)
						option.setFontSize();
					else if(subchoice == 3) {
						option.setisAlarm();
					}
					else if(subchoice == 4) {
						option.setBackground();
					}
					else if(subchoice == 5) {
						option.showOption();
					}
					else if(subchoice == 0) {
						break;
					}
					else
						System.out.println("잘못 입력하셨습니다");
				}
			}
			
			else
			{
				System.out.println("Exit Program.");
				break;
			}
		}
	}
	
	public static int showMainMenu()
	{
		int choice;
		
		System.out.println("======== Main Menu ========");
		System.out.println("1. 그룹 관리");
		System.out.println("2. 미팅기록 관리");
		System.out.println("3. 업무 관리");
		System.out.println("4. 스케줄 관리");
		System.out.println("5. 옵션");
		System.out.println("0. 종료");
		System.out.println("===========================");
		
		System.out.print(">> ");
		return sc.nextInt();
	}


}
