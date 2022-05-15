
public interface Mediator {
	void addTeammate(TaskRegister task);
	void deleteTeammate(TaskRegister task);
	void sendMessage(String message, String sender, String team);
}
