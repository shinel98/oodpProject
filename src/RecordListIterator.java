
public class RecordListIterator implements Iterator{
	
	private RecordList list;
	private int index;
	
	
	public RecordListIterator(RecordList newlist)
	{
		this.list = newlist;
		this.index = 0;
		
	}
	public boolean hasNext() {
		
		if(index < list.getRecordList().size())
			return true;
		
		else
			return false;
		
	}
	
	public Object next() {
		
		Record record = list.getRecordList().get(index);
		index++;
		
		return record;
		
	}

}
