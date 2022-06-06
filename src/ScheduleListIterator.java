
public class ScheduleListIterator implements Iterator{
	
	private ScheduleList list;
	private int index;
	
	
	public ScheduleListIterator(ScheduleList newlist)
	{
		this.list = newlist;
		this.index = 0;
		
	}
	
	public boolean hasNext() {
		
		System.out.println(list.getScheduleList().size()); //0
		if(index < list.getScheduleList().size())
			return true;
		
		else
			return false;
		
	}
	
	public Object next() {
		
		Schedule schedule = list.getScheduleList().get(index);
		index++;
		
		return schedule;
		
	}


}
