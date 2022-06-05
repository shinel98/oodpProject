
public class DisplayMode {
	
    private State state;
    
    public DisplayMode() {
        state = new NightModeOFF();
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public void on_button_pushed() {
        state.on_button_pushed(this);
    }
    
    public void off_button_pushed( ){
        state.off_button_pushed(this);
    }
    
}