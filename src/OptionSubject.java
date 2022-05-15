
public interface OptionSubject {
	
	public void registerOptionObserver(OptionObserver o);
	public void removeOptionObserver(OptionObserver o);
	public void notifyOptionObservers();
	
}