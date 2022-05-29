
public class TaskListIterator implements Iterator{
	
	private Task list;
	private int index;
	
	
	public TaskListIterator(Task newlist)
	{
		this.list = newlist;
		this.index = 0;
		
	}
	public boolean hasNext() {
		
		if(index < list.getTasklist().size())
			return true;
		
		else
			return false;
		
	}
	
	public Object next() {
		
		TaskAllocate task = list.getTasklist().get(index);
		index++;
		
		return task;
		
	}

}
