import java.util.ArrayList;

public class ScheduleShow_Decorator extends ScheduleList implements ShowSchedule {
 
	protected ShowSchedule s;
	
	public ScheduleShow_Decorator(ShowSchedule c){
		this.s=c;
	}
	
	@Override
	public void show(ArrayList<Schedule> scheduleList) {
		this.s.show(scheduleList);
	}
	
}