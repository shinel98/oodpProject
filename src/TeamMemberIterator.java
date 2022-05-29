
public class TeamMemberIterator implements Iterator{
	
	private Team list;
	private int index;
	
	
	public TeamMemberIterator(Team newUser)
	{
		this.list = newUser;
		this.index = 0;
		
	}
	public boolean hasNext() {
		
		if(index < list.getMember().size())
			return true;
		
		else
			return false;
		
	}
	
	public Object next() {
		
		User member = list.getMember().get(index);
		index++;
		
		return member;
		
	}

}
