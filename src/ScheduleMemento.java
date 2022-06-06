
public class ScheduleMemento {

	private String scheduleName;
	private String scheduleDate;
	
	public String getSavedState() {
		return "title date 미팅기록이 복구 되었습니다";
	}

	public ScheduleMemento(String newScheduleName, String newScheduleDate) {
		
		this.scheduleName = newScheduleName;
		this.scheduleDate = newScheduleDate;
	}
    
    public String getScheduleName() {
		return scheduleName;
	}

	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}

	public String getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
    
}
