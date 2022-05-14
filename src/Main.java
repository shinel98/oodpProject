import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	// commit 
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int choice;
		int subchoice;
		int subchoice_show;
		Task tsk = new Task();
		Team team = new Team();
		RecordList record = new RecordList();
		ScheduleList schedule = new ScheduleList();
		OptionChange option = new OptionChange();
		Login login = new Login();
		BufferedWriter bw = new BufferedWriter(new FileWriter("register.txt", true));
		
		while(true) { 
			choice = login.show_loginOpt();
			if(choice == 1) {
				subchoice = login.login_check();
				if(subchoice == 0) {
					System.out.println("회원가입된 정보가 없습니다.");
					continue;
				}
				else 
					System.out.println("로그인 되었습니다.");
			}
			else {
				subchoice = login.register();
				if(subchoice == 1) 
					System.out.println("회원가입 되었습니다.");
				else {
					System.out.println("회원가입에 실패했습니다.");
					continue;
				}
			}
		//}
		
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
						tsk.showTaskByTeam();
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
					{
						subchoice_show = schedule.showMenu2();
						if(subchoice_show == 1)
							schedule.showSchedule_all();
						else if(subchoice_show == 2)
							schedule.showSchedule_month();
						else if(subchoice_show == 0)
							break;
						
					}
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
			
			else if(choice == 5)
			{
				while(true)
				{
					subchoice = option.showMenu();
					if(subchoice == 1)
						option.fontChange();
					else if(subchoice == 2)
						option.fontsizeChange();
					else if(subchoice == 3) {
						option.backgroundSetting();
					}
					else if(subchoice == 4) {
						option.showCurrentOption();
					}
					else if(subchoice == 0) {
						break;
					}
				}
			}
			
			else if (choice == 6) {
				System.out.println("로그아웃 되었습니다.");
				break;
			}
			
			else
			{
				System.out.println("Exit Program.");
				break;
			}
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
		System.out.println("5. 옵션 변경");
		System.out.println("6. 로그아웃");
		System.out.println("0. 종료");
		System.out.println("===========================");
		
		System.out.print(">> ");
		return sc.nextInt();
	}


}