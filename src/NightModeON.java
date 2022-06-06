
public class NightModeON implements State_DisplayMode {
	
    private static NightModeON on = new NightModeON(); // ON 클래스의 인스턴스로 초기화됨
    private NightModeON() { }
    
    public static NightModeON getInstance() { // 초기화된 ON 클래스의 인스턴스를 반환함
        return on;
    }
    
    public void on_button_pushed(DisplayMode mode){ // ON 상태일 때 On 버튼을 눌러도 변화 없음
        System.out.println("반응 없음");
    }
    
    public void off_button_pushed(DisplayMode mode){
        mode.setState(NightModeOFF.getInstance());
        System.out.println("야간 모드 적용이 해제되었습니다.");
    }
    
}