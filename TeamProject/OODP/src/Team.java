import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Team {
	
	static Scanner sc = new Scanner(System.in);
	private static Team team = new Team();
	private ArrayList<User> member = new ArrayList<User>();
	private String teamCode;
	

	public Team() {
		this.teamCode = null;
	}
	
	public Team(String newTeamCode) {
		this.teamCode = newTeamCode;
	}
	
	public int showMenu()
	{
		int choice;
		
		System.out.println("======================");
		System.out.println("1. 팀원 추가");
		System.out.println("2. 팀원 삭제");
		System.out.println("3. 팀원 보기");
		System.out.println("0. 메인메뉴로 돌아가기");
		System.out.println("======================");
		
		System.out.print(">> ");
		return sc.nextInt();
	}
	
	
	public void addMember() {
		
		User newMember = new User();
		sc.nextLine();
		
		System.out.print("이름을 입력하세요: ");
		newMember.setName(sc.nextLine());
		System.out.print("id를 입력하1세요: ");
		newMember.setId(sc.nextInt());
		sc.nextLine();

		member.add(newMember);
	}
	
	public void deleteMember()
	{
		
		if(member.isEmpty() == true)
			System.out.println("멤버가 존재하지 않습니다");
		
		else
		{
			int index = 0;
			showMember();
			
			System.out.print("삭제할 팀원의 id를 입력하세요: ");
			int userID = sc.nextInt();
			
			for(User s : member)
			{
				if(s.getId() == userID)
				{
					member.remove(index);
					break;
				}
				index++;
			}
		}
	}
	
	public void showMember() {
		
		if(member.isEmpty() == true)
			System.out.println("멤버가 존재하지 않습니다");
		
		else
		{
			User s;
			int i=1;
			
			System.out.println("번호  이름  id");
			System.out.println("------------------------");
			
			Iterator<User> iter = member.iterator();
			
			while(iter.hasNext()) {
				s = (User)iter.next();
				System.out.printf("%d  %s  %d \n", i++ ,s.getName(), s.getId());
			}
			System.out.println("------------------------");
			System.out.println();
		}
	}
	
	public String getTeamCode() {
		return teamCode;
	}

	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}
}
