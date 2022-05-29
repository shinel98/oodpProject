
public class ScheduleListIterator implements Iterator{
	
	private ScheduleList list;
	private int index;
	
	
	public ScheduleListIterator(ScheduleList newlist)
	{
		this.list = newlist;
		this.index = 0;
		
	}
	
	public boolean hasNext() {
		
		if(index < list.getScheduleList().size())
			return true;
		
		else
			return false;
		
	}
	
	public Object next() {
		
		Schedule record = list.getScheduleList().get(index);
		index++;
		
		return record;
		
	}


}
