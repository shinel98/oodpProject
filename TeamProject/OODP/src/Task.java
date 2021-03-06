
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task {

	private LinkedList<TaskAllocate> tasklist = new LinkedList<TaskAllocate>();
	Scanner sc = new Scanner(System.in);
	
	public int showMenu() {
		int choice;
		
		System.out.println("======================");
		System.out.println("1. 업무 조회");
		System.out.println("2. 업무 추가");
		System.out.println("3. 업무 삭제");
		System.out.println("4. 업무 수정");
		System.out.println("0. 메인메뉴로 돌아가기");
		System.out.println("======================");
		
		System.out.print(">> ");
		return sc.nextInt();
	}
	
	
	public void addTask() {
	
		TaskRegister task = new TaskRegister();
		sc.nextLine();
		System.out.print("팀이름 : ");
		task.setTeam(sc.nextLine());
		System.out.print("팀원이름 : ");
		task.setTeammate(sc.nextLine());
		System.out.print("업무이름 : ");
		task.setTask(sc.nextLine());
		
		tasklist.add(task);
		
	}
	public void deleteTask() {
		if(tasklist.isEmpty() == true)
			System.out.println("저장된 업무가 없습니다");
		
		else
		{
			showTask();
			Scanner sc = new Scanner(System.in);
			//String del_task;
			//String del_teammate;
			int del_num;
		
			/*
			System.out.print("삭제할 업무 입력 : ");
			del_task = sc.nextLine();
			System.out.print("업무 담당 팀원 입력 : ");
			del_teammate = sc.nextLine();
			*/
			System.out.print("삭제할 업무 번호를 입력하세요 : ");
			del_num = sc.nextInt();
			tasklist.remove(del_num-1);
		}
		
		
		/*Iterator<TaskAllocate> iter = tasklist.iterator();
		while(iter.hasNext()) {
			task = (TaskRegister)iter.next();
			if(task.getTask().equals(del_task) && task.getTeammate().equals(del_teammate))
				tasklist.remove(i++);
		}*/
	}
	public void showTask() {
		
		if(tasklist.isEmpty() == true)
		{
			System.out.println("저장된 업무가 없습니다");
		}
		
		else
		{
			TaskRegister task = new TaskRegister();
			int i=1;
			
			System.out.println("번호  팀  이름  업무");
			System.out.println("------------------------");
			
			Iterator<TaskAllocate> iter = tasklist.iterator();
			
			while(iter.hasNext()) {
				task = (TaskRegister)iter.next();
				System.out.printf("%d  %s  %s  %s\n", i++ ,task.getTeam(), task.getTeammate(), task.getTask());
			}
			System.out.println("------------------------");
			System.out.println();
		}
	}
	public void updateTask() {
		
		showTask();
		
		Scanner sc = new Scanner(System.in);
		TaskRegister task = new TaskRegister();
		int choice;
		int i=0;
		System.out.print("수정할 번호 : ");
		choice = sc.nextInt();
		sc.nextLine();
		System.out.print("팀이름 : ");
		task.setTeam(sc.nextLine());
		System.out.print("팀원이름 : ");
		task.setTeammate(sc.nextLine());
		System.out.print("업무이름 : ");
		task.setTask(sc.nextLine());
		
		tasklist.remove(choice-1);
		tasklist.add(choice-1, task);
		
	}
	
	public void showTaskByTeam() {
		String team;
		sc.nextLine();
		System.out.println("찾으려고하는 팀: ");
		team = sc.nextLine();
		
		if(tasklist.isEmpty() == true)
		{
			System.out.println("저장된 업무가 없습니다");
		}
		else
		{
			TaskRegister task = new TaskRegister();
			int i=1;
			
			System.out.println("번호  팀  이름  업무");
			System.out.println("------------------------");
			
			Iterator<TaskAllocate> iter = tasklist.iterator();
			
			while(iter.hasNext()) {
				task = (TaskRegister)iter.next();
				if(task.getTeam().equals(team))
					System.out.printf("%d  %s  %s  %s\n", i++ ,task.getTeam(), task.getTeammate(), task.getTask());
			}
			System.out.println("------------------------");
			System.out.println();
		}
	}
	
}
