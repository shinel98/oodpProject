
public class DisplayMode {
	
    private State_DisplayMode state;
    
    public DisplayMode() {
        state = new NightModeOFF();
    }
    
    public void setState(State_DisplayMode state) {
        this.state = state;
    }
    
    public void on_button_pushed() {
        state.on_button_pushed(this);
    }
    
    public void off_button_pushed( ){
        state.off_button_pushed(this);
    }
    
}