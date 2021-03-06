import java.util.Iterator;
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
		Task tsk = Task.getInstance();
		Team team = Team.getInstance();
		RecordList record = RecordList.getInstance();
		ScheduleList schedule = ScheduleList.getInstance();
		OptionChange option = OptionChange.getInstance();
		//Login login = new Login();
		BufferedWriter bw = new BufferedWriter(new FileWriter("register.txt", true));

		
		while(true) { 
		/*
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
			
		*/
		LoginFacade lf = LoginFacade.getInstance();
		if(lf.login() == 0) {
			continue;
		}
		
		
		while(true) {
			
			choice = showMainMenu();
			if(choice == 1)
			{
				while (true)
				{
					MenuTemplate teammenu= new TeamMenu();
					subchoice = sc.nextInt();

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
					MenuTemplate recordmenu= new RecordMenu();
					subchoice = sc.nextInt();
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
					else if(subchoice == 5)
					{
						record.restoreFromMemento();
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
					MenuTemplate taskmenu= new TaskMenu();
					subchoice = sc.nextInt();
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
					MenuTemplate schedulemenu= new ScheduleMenu();
					subchoice = sc.nextInt();
					if(subchoice == 1)
					{
						subchoice_show = schedule.showMenu2();
						if(subchoice_show == 1)
							schedule.showSchedule_all();
						else if(subchoice_show == 2)
							schedule.showSchedule_month();
						else if(subchoice_show == 3)
							schedule.showSchedule_urgent();
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
					
					else if(subchoice == 5)
					{
						schedule.restoreFromMemento(  );
					}
					
					else if(subchoice == 0) {
						break;
					}
				}
			}
			
			else if(choice == 5)
			{
				DisplayMode mode = new DisplayMode();
				while(true)
				{
					MenuTemplate optionmenu= new OptionMenu();
					subchoice = sc.nextInt();
					if(subchoice == 1)
						option.fontChange();
					else if(subchoice == 2)
						option.fontsizeChange();
					else if(subchoice == 3) {
						option.backgroundSetting();
					}
					else if(subchoice == 4) {
						mode.on_button_pushed();
					}
					else if(subchoice == 5) {
						mode.off_button_pushed();
					}
					else if(subchoice == 6) {
						option.showCurrentOption();
					}
					else if(subchoice == 0) {
						break;
					}
				}
			}
			
			else if (choice == 6) {
				lf.logoutCheck();
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
		
		System.out.println("======== Main Menu ========");
		System.out.println("1. 그룹 관리");
		System.out.println("2. 미팅기록 관리");
		System.out.println("3. 업무 관리");
		System.out.println("4. 스케줄 관리");
		System.out.println("5. 옵션 변경");
		System.out.println("6. 로그아웃");
		System.out.println("0. 종료");
		System.out.println("===========================");
		
		System.out.println(">> ");
		
		return sc.nextInt();
	}


}