import java.util.ArrayList;

public class ScheduleCareTaker {
	
	private ArrayList<ScheduleMemento> mementoScheduleList = new ArrayList<ScheduleMemento>();
	
	public void push(ScheduleMemento memento) {
		
		mementoScheduleList.add(memento);
	}
	
	public void pop(int num) {
		
		mementoScheduleList.remove(num);
	}
	
	public ArrayList<ScheduleMemento> getMementoScheduleList() {
		return mementoScheduleList;
	}

}
