
import java.util.ArrayList;
import java.util.List;

public class TaskMediator implements Mediator {
	private List<TaskRegister> teammates;
	
	TaskMediator(){
		this.teammates = new ArrayList<>();
	}

	@Override
	public void addTeammate(TaskRegister task) {
		// TODO Auto-generated method stub
		teammates.add(task);
	}

	@Override
	public void deleteTeammate(TaskRegister task) {
		// TODO Auto-generated method stub
		teammates.remove(task);
	}

	@Override
	public void sendMessage(String message, String sender, String team) {
		// TODO Auto-generated method stub
		for(TaskRegister task : teammates) {
			if(!(sender.equals(task.getTeammate())) && team.equals(task.getTeam())) 
				// New task added by {sender} 
				task.receive(message+" "+sender);
				
		}
	}
	
}
