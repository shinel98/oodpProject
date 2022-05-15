import java.util.Scanner;

public class TaskRegister implements TaskAllocate {
	private String team;
	private String teammate;
	private String task;
	private Mediator mediator;
	
	TaskRegister(Mediator mediator){
		this.mediator = mediator;
	}
	
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getTeammate() {
		return teammate;
	}
	public void setTeammate(String teammate) {
		this.teammate = teammate;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	@Override
	public void send(String msg, int opt) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("본인 이름: ");
		String name = sc.nextLine();
		System.out.println(name+" Sending Message: "+ msg);
		if(opt == 1)
			mediator.sendMessage("New Task added by", name, this.team);
		else if(opt == 2)
			mediator.sendMessage("Task deleted by", name, this.team);
		else
			mediator.sendMessage("Task updated by", name, this.team);	
		
	//	sc.close();
	}
	@Override
	public void receive(String msg) {
		// TODO Auto-generated method stub
		System.out.println(this.teammate+" Recieved Message: "+msg);
	}	
}
