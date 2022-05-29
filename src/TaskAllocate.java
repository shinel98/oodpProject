
public abstract class TaskAllocate {
	// For Mediator
	protected Mediator mediator;
	
	TaskAllocate(){}
	
	TaskAllocate(Mediator mediator){
		this.mediator = mediator;
	}
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void send(String msg, int opt) {}
	public void receive(String msg) {}
}
