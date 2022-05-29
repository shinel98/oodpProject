import java.util.ArrayList;

public class CareTaker {
	
	private ArrayList<RecordMemento> mementoRecordList = new ArrayList<RecordMemento>();
	
	public void push(RecordMemento memento) {
		
		mementoRecordList.add(memento);
	}
	
	public void pop(int num) {
		
		mementoRecordList.remove(num);
	}
	
	public ArrayList<RecordMemento> getMementoRecordList() {
		return mementoRecordList;
	}

}
