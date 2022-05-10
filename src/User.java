// Roll�� ���� ���������� ���� => �پ��� ���� �߰� �� �� ����
public class User {
	
	private String name;
	private int id;
	private String roll;
	private String task;
	
	public User()
	{
		this.name = null;
		this.id = -1;
		this.roll = null;
	}

	public User(String newName, int newId, String newRoll) {
		
		this.name = newName;
		this.id = newId;
		this.roll = newRoll;	
	}
	
	public User(String newName, int newId) {
		
		this.name = newName;
		this.id = newId;
		this.roll = null;	
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getRoll() {
		return roll;
	}
	
	public void setRoll(String roll) {
		this.roll = roll;
	}
	
	public String getTask() {
		return task;
	}


	public void setTask(String task) {
		this.task = task;
	}

}
